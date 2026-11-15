package com.igorkan.modules.dijkstra_indexed_heap;

import java.util.List;

public interface Contract {
    Types.PathResult shortestPaths(List<List<Types.Edge>> adj, int source);
}
