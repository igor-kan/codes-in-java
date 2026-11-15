package com.igorkan.modules.bplus_order_map;

public final class Benchmark {
    private Benchmark() {}
    public static void main(String[] args) {
        Core bp = new Core(16);
        for (int i = 0; i < 2000; i++) bp.put(i, "val" + i);
        long t0 = System.nanoTime();
        int sink = 0;
        for (int i = 0; i < 1000; i++) sink += bp.rangeScan(100, 300).size();
        System.out.println("bplus_order_map ns=" + (System.nanoTime() - t0) / 1000 + " sink=" + sink);
    }
}
