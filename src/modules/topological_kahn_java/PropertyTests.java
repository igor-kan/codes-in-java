package com.igorkan.modules.topological_kahn_java;

import java.util.List;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        var res = Concurrent.parallelLongestPaths(List.of(
            new Concurrent.DagJob(4, List.of(new int[]{0,1}, new int[]{1,2}, new int[]{2,3})),
            new Concurrent.DagJob(4, List.of(new int[]{0,1}, new int[]{0,2}, new int[]{1,3}))
        ));
        if (!res.equals(List.of(3, 2))) throw new AssertionError("unexpected longest paths: " + res);
    }
}
