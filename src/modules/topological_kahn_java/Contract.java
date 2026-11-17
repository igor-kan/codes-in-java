package com.igorkan.modules.topological_kahn_java;

import java.util.List;

public interface Contract {
    Types.TopoResult sortDag(int n, List<int[]> edges);
}
