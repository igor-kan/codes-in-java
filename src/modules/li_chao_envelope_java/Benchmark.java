package com.igorkan.modules.li_chao_envelope_java;

import java.util.*;

public final class Benchmark {
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long sink = 0;
        Core c = new Core(); var lns = List.of(new Types.Line(2, 5), new Types.Line(-1, 30)); for(int i=0;i<100;i++) sink += c.queryMin(32, lns, i & 15);
        long ns = System.nanoTime() - t0;
        System.out.println("li_chao_envelope_java ns=" + ns + " sink=" + sink);
    }
}
