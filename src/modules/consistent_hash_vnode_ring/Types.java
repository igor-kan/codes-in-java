package com.igorkan.modules.consistent_hash_vnode_ring;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public final class Types {
    private Types() {}

    public record RingConfig(int vnodesPerNode) {}

    public static final class HashRing {
        public final int vnodes;
        public final TreeMap<Long, String> ring = new TreeMap<>();

        public HashRing(int vnodes) {
            this.vnodes = vnodes;
        }

        public Map<Long, String> snapshot() {
            return Collections.unmodifiableMap(ring);
        }
    }
}
