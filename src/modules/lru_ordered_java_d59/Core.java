package com.igorkan.modules.lru_ordered_java_d59;

import java.util.*;

public final class Core implements Contract {
    private int cap = 2;
    private Map<Integer, Integer> cache;

    public void init(int capacity) {
        this.cap = capacity;
        this.cache = new LinkedHashMap<>(capacity + 1, Types.LOAD_FACTOR, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > cap;
            }
        };
    }

    @Override
    public int get(int key) { return cache.getOrDefault(key, -1); }

    public void put(int key, int val) { cache.put(key, val); }
    public int size() { return cache.size(); }
}
