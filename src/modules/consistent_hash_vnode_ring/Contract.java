package com.igorkan.modules.consistent_hash_vnode_ring;

public interface Contract {
    void addNode(String nodeId);
    void removeNode(String nodeId);
    String route(String key);
}
