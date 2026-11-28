package com.igorkan.modules.booth_min_rotation_java_d61;

import java.util.*;

public final class Core implements Contract {
    @Override
    public int leastRotation(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        int i = 0;
        int j = 1;
        int k = 0;
        while (i < n && j < n && k < n) {
            char a = s.charAt((i + k) % n);
            char b = s.charAt((j + k) % n);
            if (a == b) {
                ++k;
                continue;
            }
            if (a > b) {
                i += k + 1;
                if (i <= j) {
                    i = j + 1;
                }
            } else {
                j += k + 1;
                if (j <= i) {
                    j = i + 1;
                }
            }
            k = 0;
        }
        return Math.min(i, j);
    }

    @Override
    public String minimalRotation(String s) {
        int n = s.length();
        if (n == 0) {
            return "";
        }
        int start = leastRotation(s);
        return s.substring(start) + s.substring(0, start);
    }

    @Override
    public Types.RotationInfo rotationInfo(String s) {
        return new Types.RotationInfo(leastRotation(s), minimalRotation(s));
    }
}
