package com.igorkan.modules.consistent_hash_vnode_ring;

import java.util.HashSet;
import java.util.Set;

public final class Invariants {
    private Invariants() {}

    public static void verifyDistinctOwners(Types.HashRing ring, Set<String> expectedNodes) {
        Set<String> seen = new HashSet<>(ring.ring.values());
        Errors.require(seen.equals(expectedNodes), "ring owners diverge from registered nodes");
    }
}
