package com.igorkan.modules.ring_blocking_buf_d58;

import java.util.*;

public final class PropertyTests {
    public static void main(String[] args) throws Exception {
        long f = Concurrent.parallelFoldPair(new long[]{1, 2}, new long[]{3, 4});
        if (f == 0L) throw new AssertionError("zero fold");
        Core rq = new Core();
        rq.init(4);
        for (long i = 0; i < 20; i++) {
            if (!rq.offer(i) || rq.pollOrDefault(-1) != i) throw new AssertionError();
        }
        if (rq.size() != 0) throw new AssertionError();
    }
}
