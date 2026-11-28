package com.igorkan.modules.fenwick_2d_rect_java_d61;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core f = new Core(32, 32);
        for (int i = 0; i < 32; ++i) {
            for (int j = 0; j < 32; ++j) {
                f.add(i, j, i + j);
            }
        }
        for (int it = 0; it < 200; ++it) {
            sink += f.rectSum(new Types.RectQuery(0, 0, it & 31, 31));
        }
        long ns = System.nanoTime() - t0;
        System.out.println("fenwick_2d_rect_java_d61 ns=" + ns + " sink=" + sink);
    }
}
