package com.igorkan.modules.ring_blocking_buf_d58;

import java.util.*;

public final class UnitTests {
    public static void main(String[] args) {
        Validation.requirePositive(1);
        Core rq = new Core();
        rq.init(3);
        if (!rq.offer(10) || !rq.offer(20) || !rq.offer(30) || rq.offer(40)) throw new AssertionError();
        if (rq.pollOrDefault(-1) != 10 || !rq.offer(40) || rq.size() != 3) throw new AssertionError();
        Invariants.ensure(true, "unit ok");
    }
}
