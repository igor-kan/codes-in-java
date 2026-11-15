package com.igorkan.modules.rope_balanced_text;

public final class Benchmark {
    private Benchmark() {}
    public static void main(String[] args) {
        Core rope = new Core();
        Types.RopeNode r = new Types.RopeNode("block_0");
        for (int i = 1; i < 64; i++) r = rope.concat(r, new Types.RopeNode("_block_" + i));
        long t0 = System.nanoTime();
        int sink = 0;
        for (int i = 0; i < 20000; i++) sink += rope.charAt(r, i % r.totalLen);
        System.out.println("rope_balanced_text ns=" + (System.nanoTime() - t0) / 20000 + " sink=" + sink);
    }
}
