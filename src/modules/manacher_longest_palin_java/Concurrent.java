package com.igorkan.modules.manacher_longest_palin_java;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public final class Concurrent {
    public static long parallelTotalPalindromes(List<String> texts) throws Exception {
        Core engine = new Core();
        try (var pool = Executors.newFixedThreadPool(2)) {
            List<Future<Types.PalinResult>> futs = texts.stream()
                .map(txt -> pool.submit(() -> engine.analyze(txt)))
                .toList();
            long sum = 0;
            for (var f : futs) sum += f.get().totalSubstrings();
            return sum;
        }
    }
}
