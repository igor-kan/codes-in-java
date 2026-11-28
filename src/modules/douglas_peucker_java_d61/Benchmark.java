package com.igorkan.modules.douglas_peucker_java_d61;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core();
        Types.Pt[] pts = new Types.Pt[256];
        for (int i = 0; i < pts.length; ++i) pts[i] = new Types.Pt(i, (i * i * 7) % 23);
        for (int it = 0; it < 500; ++it) {
            sink += c.simplify(pts, 0.5).length;
        }
        long ns = System.nanoTime() - t0;
        System.out.println("douglas_peucker_java_d61 ns=" + ns + " sink=" + sink);
    }
}
