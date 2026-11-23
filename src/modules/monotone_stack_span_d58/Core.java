package com.igorkan.modules.monotone_stack_span_d58;

import java.util.*;

public final class Core implements Contract {
    @Override
    public int[] backwardSpans(int[] vals) {
        int n = vals.length;
        int[] span = new int[n];
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && vals[stk.peek()] <= vals[i]) stk.pop();
            span[i] = stk.isEmpty() ? (i + 1) : (i - stk.peek());
            stk.push(i);
        }
        return span;
    }
}
