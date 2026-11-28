package com.igorkan.modules.booth_min_rotation_java_d61;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        String s = "cbaabacbacccbbacababanana";
        for (int it = 0; it < 20000; ++it) {
            sink += c.leastRotation(s);
        }
        long ns = System.nanoTime() - t0;
        System.out.println("booth_min_rotation_java_d61 ns=" + ns + " sink=" + sink);
    }
}
