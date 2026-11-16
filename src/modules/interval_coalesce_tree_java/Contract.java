package com.igorkan.modules.interval_coalesce_tree_java;

import java.util.List;

public interface Contract {
    void addRange(int lo, int hi);
    boolean contains(int point);
    long coveredPoints();
    List<Types.Interval> snapshot();
}
