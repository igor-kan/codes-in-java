package com.igorkan.modules.cartesian_rmq_tree_java;

import java.util.*;

public final class Core implements Contract {
    public static Types.TreeDesc build(long[] arr) {
        int n = arr.length;
        int[] left = new int[n], right = new int[n], st = new int[n];
        Arrays.fill(left, -1); Arrays.fill(right, -1);
        int top = 0;
        for (int i = 0; i < n; i++) {
            int last = -1;
            while (top > 0 && arr[st[top - 1]] > arr[i]) last = st[--top];
            if (top > 0) right[st[top - 1]] = i;
            if (last != -1) left[i] = last;
            st[top++] = i;
        }
        return new Types.TreeDesc(st[0], left, right);
    }
    @Override
    public int queryRmqIndex(long[] arr, int l, int r) {
        Types.TreeDesc td = build(arr);
        int cur = td.root();
        while (cur != -1) {
            if (cur < l) cur = td.right()[cur];
            else if (cur > r) cur = td.left()[cur];
            else return cur;
        }
        return -1;
    }
}
