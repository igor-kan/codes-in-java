package com.igorkan.modules.manacher_longest_palin_java;

public final class UnitTests {
    public static void main(String[] args) {
        Core engine = new Core();
        for (String s : new String[]{"babad", "cbbd", "abacdfgdcaba", "aaaaaa"}) {
            var res = engine.analyze(s);
            Invariants.verifyMatchesBrute(s, res);
        }
    }
}
