package com.igorkan.modules.douglas_peucker_java_d61;

import java.util.*;

public final class Core implements Contract {
    @Override
    public double perpendicularDistance(Types.Pt p, Types.Pt a, Types.Pt b) {
        double dx = b.x() - a.x();
        double dy = b.y() - a.y();
        if (dx == 0.0 && dy == 0.0) {
            return Math.hypot(p.x() - a.x(), p.y() - a.y());
        }
        double num = Math.abs(dy * p.x() - dx * p.y() + b.x() * a.y() - b.y() * a.x());
        return num / Math.hypot(dx, dy);
    }

    @Override
    public Types.Pt[] simplify(Types.Pt[] points, double epsilon) {
        int n = points.length;
        if (n <= 2) {
            return points.clone();
        }
        boolean[] keep = new boolean[n];
        keep[0] = true;
        keep[n - 1] = true;
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[]{0, n - 1});
        while (!stack.isEmpty()) {
            int[] seg = stack.pop();
            int a = seg[0];
            int b = seg[1];
            double maxDist = -1.0;
            int idx = -1;
            for (int i = a + 1; i < b; ++i) {
                double d = perpendicularDistance(points[i], points[a], points[b]);
                if (d > maxDist) {
                    maxDist = d;
                    idx = i;
                }
            }
            if (idx != -1 && maxDist > epsilon) {
                keep[idx] = true;
                stack.push(new int[]{a, idx});
                stack.push(new int[]{idx, b});
            }
        }
        int count = 0;
        for (boolean k : keep) {
            if (k) {
                ++count;
            }
        }
        Types.Pt[] out = new Types.Pt[count];
        int j = 0;
        for (int i = 0; i < n; ++i) {
            if (keep[i]) {
                out[j++] = points[i];
            }
        }
        return out;
    }
}
