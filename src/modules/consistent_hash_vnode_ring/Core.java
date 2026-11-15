package com.igorkan.modules.consistent_hash_vnode_ring;

import java.nio.charset.StandardCharsets;
import java.util.Map;

public final class Core implements Contract {
    private final Types.HashRing state;

    public Core(Types.HashRing state) {
        this.state = state;
    }

    public static long fnv1a64(String text) {
        long h = 0xcbf29ce484222325L;
        for (byte b : text.getBytes(StandardCharsets.UTF_8)) {
            h ^= (b & 0xffL);
            h *= 0x100000001b3L;
        }
        return h;
    }

    @Override
    public void addNode(String nodeId) {
        Errors.require(nodeId != null && !nodeId.isEmpty(), "empty nodeId");
        for (int i = 0; i < state.vnodes; i++) {
            state.ring.put(fnv1a64(nodeId + "#" + i), nodeId);
        }
    }

    @Override
    public void removeNode(String nodeId) {
        for (int i = 0; i < state.vnodes; i++) {
            state.ring.remove(fnv1a64(nodeId + "#" + i));
        }
    }

    @Override
    public String route(String key) {
        Errors.require(!state.ring.isEmpty(), "ring empty");
        long token = fnv1a64(key);
        Map.Entry<Long, String> e = state.ring.ceilingEntry(token);
        if (e == null) {
            e = state.ring.firstEntry();
        }
        return e.getValue();
    }
}
