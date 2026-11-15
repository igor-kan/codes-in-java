package com.igorkan.modules.dijkstra_indexed_heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class FastPath {
    private FastPath() {}

    public static List<Integer> reconstructPath(Types.PathResult res, int target) {
        if (!Double.isFinite(res.dist()[target])) return List.of();
        List<Integer> path = new ArrayList<>();
        for (int v = target; v != -1; v = res.parent()[v]) {
            path.add(v);
        }
        Collections.reverse(path);
        return path;
    }
}
