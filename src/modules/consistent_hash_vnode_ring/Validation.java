package com.igorkan.modules.consistent_hash_vnode_ring;

public final class Validation {
    private Validation() {}

    public static void validateConfig(Types.RingConfig cfg) {
        Errors.require(cfg.vnodesPerNode() >= 1 && cfg.vnodesPerNode() <= 4096, "invalid vnode count");
    }
}
