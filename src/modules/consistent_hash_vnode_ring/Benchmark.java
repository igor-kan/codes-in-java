package com.igorkan.modules.consistent_hash_vnode_ring;

public final class Benchmark {
    private Benchmark() {}
    public static void main(String[] args) {
        Types.HashRing hr = new Types.HashRing(128);
        Core router = new Core(hr);
        router.addNode("a"); router.addNode("b"); router.addNode("c");
        long t0 = System.nanoTime();
        int sink = 0;
        for (int i = 0; i < 20000; i++) sink += router.route("item_" + i).length();
        System.out.println("consistent_hash_vnode_ring ns=" + (System.nanoTime() - t0) / 20000 + " sink=" + sink);
    }
}
