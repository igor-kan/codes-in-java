package com.igorkan.modules.ring_blocking_buf_d58;

import java.util.*;

public final class Core implements Contract {
    private long[] buf;
    private int head = 0, tail = 0, count = 0;

    public void init(int cap) { buf = new long[cap]; head = 0; tail = 0; count = 0; }

    @Override
    public boolean offer(long v) {
        if (count == buf.length) return false;
        buf[tail] = v;
        tail = (tail + 1) % buf.length;
        count++;
        return true;
    }

    public long pollOrDefault(long fallback) {
        if (count == 0) return fallback;
        long v = buf[head];
        head = (head + 1) % buf.length;
        count--;
        return v;
    }

    public int size() { return count; }
}
