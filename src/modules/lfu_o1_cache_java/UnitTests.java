package com.igorkan.modules.lfu_o1_cache_java;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.checkCapacity(2);
        Core lfu = new Core(2);
        lfu.put(1, 1);
        lfu.put(2, 2);
        if (lfu.get(1) != 1) throw new AssertionError("get 1 failed");
        lfu.put(3, 3); // evicts key 2 (freq 1), retains key 1 (freq 2)
        if (lfu.get(2) != -1) throw new AssertionError("key 2 should be evicted");
        if (lfu.get(3) != 3) throw new AssertionError("key 3 missing");
        lfu.put(4, 4); // key 1 has freq 2, key 3 has freq 2, key 3 is LRU among tie? wait: get(3) made 3 MRU, so 1 was LRU!
        if (lfu.get(1) != -1 || lfu.get(3) != 3 || lfu.get(4) != 4) throw new AssertionError("LRU tie-break failed");
        Invariants.verify(lfu);
    }
}
