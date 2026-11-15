package com.igorkan.modules.consistent_hash_vnode_ring;

import java.util.Map;
import java.util.Set;

public final class UnitTests {
    private UnitTests() {}
    public static void main(String[] args) {
        Validation.validateConfig(new Types.RingConfig(128));
        Types.HashRing hr = new Types.HashRing(128);
        Core router = new Core(hr);
        router.addNode("nodeA");
        router.addNode("nodeB");
        router.addNode("nodeC");
        Invariants.verifyDistinctOwners(hr, Set.of("nodeA", "nodeB", "nodeC"));
        Map<String, Integer> dist = FastPath.sampleDistribution(router, 1200);
        for (int c : dist.values()) {
            assert c > 250 : "skewed consistent hash ring: " + c;
        }
        router.removeNode("nodeC");
        Invariants.verifyDistinctOwners(hr, Set.of("nodeA", "nodeB"));
    }
}
