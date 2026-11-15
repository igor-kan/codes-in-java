package com.igorkan.modules.bplus_order_map;

import java.util.List;

public final class UnitTests {
    private UnitTests() {}
    public static void main(String[] args) {
        Core bp = new Core(4);
        for (int i : new int[]{10, 5, 20, 15, 30, 25, 35, 1, 8, 12}) bp.put(i, "v" + i);
        Validation.verifyUniformDepth(bp.root);
        assert "v15".equals(bp.get(15));
        assert bp.rangeScan(8, 25).equals(List.of("v8", "v10", "v12", "v15", "v20", "v25"));
        assert Invariants.collectLeafKeys(bp.root).size() == 10;
    }
}
