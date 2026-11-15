package com.igorkan.modules.kd_tree_nearest_neighbor;

public final class Types {
    private Types() {}
    public record PointKD(int id, double[] coords) {}
    public record NearestHit(int id, double distSq) {}
}
