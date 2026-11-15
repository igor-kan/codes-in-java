package com.igorkan.modules.huffman_canonical_codec;

public final class Benchmark {
    private Benchmark() {}
    public static void main(String[] args) {
        byte[] data = "aaaaabbbccdeeeeeeffffggggghhhhh".repeat(32).getBytes(java.nio.charset.StandardCharsets.UTF_8);
        Core codec = new Core(data);
        long t0 = System.nanoTime();
        int sink = 0;
        for (int i = 0; i < 200; i++) sink += codec.encode(data).bitCount();
        System.out.println("huffman_canonical_codec ns=" + (System.nanoTime() - t0) / 200 + " sink=" + sink);
    }
}
