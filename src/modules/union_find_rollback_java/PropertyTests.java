package com.igorkan.modules.union_find_rollback_java;

import java.util.List;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        var res = Concurrent.parallelComponentsAfterEdges(10, List.of(
            List.of(new int[]{0,1}, new int[]{1,2}, new int[]{3,4}),
            List.of(new int[]{0,9})
        ));
        if (!res.equals(List.of(7, 9))) throw new AssertionError("unexpected counts: " + res);
    }
}
