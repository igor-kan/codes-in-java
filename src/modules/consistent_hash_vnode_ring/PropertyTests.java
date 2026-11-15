package com.igorkan.modules.consistent_hash_vnode_ring;

import java.util.HashMap;
import java.util.Map;

public final class PropertyTests {
    private PropertyTests() {}
    public static void main(String[] args) {
        Types.HashRing hr = new Types.HashRing(100);
        Core router = new Core(hr);
        router.addNode("n1");
        router.addNode("n2");
        router.addNode("n3");
        Map<Integer, String> before = new HashMap<>();
        for (int i = 0; i < 600; i++) {
            before.put(i, router.route("k-" + i));
        }
        router.addNode("n4");
        int stayedOrNew = 0;
        for (int i = 0; i < 600; i++) {
            String cur = router.route("k-" + i);
            if (cur.equals(before.get(i)) || cur.equals("n4")) {
                stayedOrNew++;
            }
        }
        assert stayedOrNew == 600 : "keys shuffled among old nodes";
    }
}
