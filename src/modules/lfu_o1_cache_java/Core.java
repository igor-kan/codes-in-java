package com.igorkan.modules.lfu_o1_cache_java;

import java.util.HashMap;
import java.util.Map;

public final class Core implements Contract {
    public final int capacity;
    public final Map<Integer, Types.CacheNode> map = new HashMap<>();
    public final Map<Integer, Types.FreqBucket> buckets = new HashMap<>();
    public int minFreq = 0;

    public Core(int capacity) {
        Errors.require(capacity > 0, "capacity must be > 0");
        this.capacity = capacity;
    }

    private void addFront(Types.FreqBucket b, Types.CacheNode n) {
        n.next = b.head.next;
        n.prev = b.head;
        b.head.next.prev = n;
        b.head.next = n;
        b.size++;
    }

    private void removeNode(Types.FreqBucket b, Types.CacheNode n) {
        n.prev.next = n.next;
        n.next.prev = n.prev;
        n.prev = null;
        n.next = null;
        b.size--;
    }

    private void touch(Types.CacheNode n) {
        int oldF = n.freq;
        Types.FreqBucket oldB = buckets.get(oldF);
        removeNode(oldB, n);
        if (oldF == minFreq && oldB.size == 0) {
            minFreq++;
        }
        n.freq++;
        buckets.computeIfAbsent(n.freq, k -> new Types.FreqBucket());
        addFront(buckets.get(n.freq), n);
    }

    @Override
    public int get(int key) {
        Types.CacheNode n = map.get(key);
        if (n == null) return -1;
        touch(n);
        return n.value;
    }

    @Override
    public void put(int key, int value) {
        Types.CacheNode existing = map.get(key);
        if (existing != null) {
            existing.value = value;
            touch(existing);
            return;
        }
        if (map.size() >= capacity) {
            Types.FreqBucket mb = buckets.get(minFreq);
            Types.CacheNode lru = mb.tail.prev;
            removeNode(mb, lru);
            map.remove(lru.key);
        }
        Types.CacheNode fresh = new Types.CacheNode(key, value);
        map.put(key, fresh);
        minFreq = 1;
        buckets.computeIfAbsent(1, k -> new Types.FreqBucket());
        addFront(buckets.get(1), fresh);
    }

    @Override
    public int size() {
        return map.size();
    }
}
