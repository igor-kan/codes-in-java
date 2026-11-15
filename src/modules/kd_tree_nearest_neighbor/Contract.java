package com.igorkan.modules.kd_tree_nearest_neighbor;

import java.util.List;

public interface Contract {
    Types.NearestHit nearest(double[] query);
    List<Types.PointKD> allPoints();
}
