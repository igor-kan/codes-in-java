package com.igorkan.modules.rabin_karp_java_d59;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        for (int it = 0; it < 200; it++) sink += c.indexOfRolling("alphabetagamma", "beta");
        long ns = System.nanoTime() - t0;
        System.out.println("rabin_karp_java_d59 ns=" + ns + " sink=" + sink);
    }
}
