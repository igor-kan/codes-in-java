package com.igorkan.modules.myers_bit_edit_java_d61;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        for (int it = 0; it < 500; ++it) {
            sink += c.distance("kitten", "sitting");
        }
        long ns = System.nanoTime() - t0;
        System.out.println("myers_bit_edit_java_d61 ns=" + ns + " sink=" + sink);
    }
}
