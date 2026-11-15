package com.igorkan.modules.consistent_hash_vnode_ring;

import java.util.HashMap;
import java.util.Map;

public final class FastPath {
    private FastPath() {}

    public static Map<String, Integer> sampleDistribution(Core router, int sampleCount) {
        Map<String, Integer> counts = new HashMap<>();
        for (int i = 0; i < sampleCount; i++) {
            String owner = router.route("key_" + i);
            counts.merge(owner, 1, Integer::sum);
        }
        return counts;
    }
}
