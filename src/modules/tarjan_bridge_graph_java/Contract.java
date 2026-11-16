package com.igorkan.modules.tarjan_bridge_graph_java;

import java.util.List;

public interface Contract {
    Types.BridgeReport findBridges(int n, List<Types.Edge> edges);
}
