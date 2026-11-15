package com.igorkan.modules.kd_tree_nearest_neighbor;

public final class Benchmark {
    private Benchmark() {}
    public static void main(String[] args) {
        java.util.List<Types.PointKD> pts = new java.util.ArrayList<>();
        for (int i = 0; i < 512; i++) pts.add(new Types.PointKD(i, new double[]{i % 31, (i * 7) % 47, (i * 11) % 29}));
        Core kd = new Core(pts);
        double[] q = {14.2, 21.8, 9.1};
        long t0 = System.nanoTime();
        double sink = 0;
        for (int i = 0; i < 5000; i++) sink += kd.nearest(q).distSq();
        System.out.println("kd_tree_nearest_neighbor ns=" + (System.nanoTime() - t0) / 5000 + " sink=" + sink);
    }
}
