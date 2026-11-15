package com.igorkan.modules.segment_tree_rmq;

public final class UnitTests {
    private UnitTests() {}
    public static void main(String[] args) {
        long[] init = {5, 2, 6, 3, 1, 7};
        Core seg = new Core(init);
        Validation.validateRange(init.length, 1, 4);
        assert seg.rangeMin(0, 5) == 1;
        seg.rangeAdd(3, 5, 5);
        for (int i = 3; i <= 5; i++) init[i] += 5;
        Invariants.verifyMatchesBrute(seg, init, 0, 5);
        assert seg.rangeMin(0, 5) == 2;
        assert FastPath.globalMinFast(seg) == 2;
    }
}
