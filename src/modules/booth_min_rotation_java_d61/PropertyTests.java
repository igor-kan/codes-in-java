package com.igorkan.modules.booth_min_rotation_java_d61;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core c = new Core();
        String[] samples = {"banana", "cba", "aaaa", "abab", "z", "mississippi", "abcabcabc"};
        for (String s : samples) {
            String best = c.minimalRotation(s);
            if (best.length() != s.length()) throw new AssertionError("length");
            for (int r = 0; r < s.length(); ++r) {
                String rot = s.substring(r) + s.substring(0, r);
                if (rot.compareTo(best) < 0) throw new AssertionError("rotation " + r + " of " + s);
            }
            int start = c.leastRotation(s);
            String rotated = s.substring(start) + s.substring(0, start);
            if (!rotated.equals(best)) throw new AssertionError("start mismatch " + s);
            if (c.leastRotation(best) != 0) throw new AssertionError("canonical " + best);
        }
    }
}
