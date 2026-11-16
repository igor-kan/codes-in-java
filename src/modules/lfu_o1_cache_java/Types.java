package com.igorkan.modules.lfu_o1_cache_java;

public final class Types {
    private Types() {}

    public static final class CacheNode {
        public final int key;
        public int value;
        public int freq;
        public CacheNode prev;
        public CacheNode next;

        public CacheNode(int key, int value) {
            this.key = key;
            this.value = value;
            this.freq = 1;
        }
    }

    public static final class FreqBucket {
        public final CacheNode head = new CacheNode(-1, -1);
        public final CacheNode tail = new CacheNode(-1, -1);
        public int size = 0;

        public FreqBucket() {
            head.next = tail;
            tail.prev = head;
        }
    }
}
