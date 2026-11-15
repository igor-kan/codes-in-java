package com.igorkan.modules.bplus_order_map;

import java.util.TreeMap;

public final class PropertyTests {
    private PropertyTests() {}
    public static void main(String[] args) {
        Core bp = new Core(5);
        TreeMap<Long, String> ref = new TreeMap<>();
        for (int i = 0; i < 150; i++) {
            long k = (i * 41L + 7L) % 89L;
            bp.put(k, "x" + i);
            ref.put(k, "x" + i);
        }
        Validation.verifyUniformDepth(bp.root);
        assert Invariants.collectLeafKeys(bp.root).equals(new java.util.ArrayList<>(ref.keySet()));
    }
}
