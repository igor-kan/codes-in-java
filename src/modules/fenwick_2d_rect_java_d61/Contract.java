package com.igorkan.modules.fenwick_2d_rect_java_d61;

public interface Contract {
    void add(int x, int y, long delta);
    long rectSum(Types.RectQuery q);
}
