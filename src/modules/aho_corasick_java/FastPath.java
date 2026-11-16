package com.igorkan.modules.aho_corasick_java;

public final class FastPath {
    private FastPath() {}

    public static int countMatches(Core ac, String text) {
        int cnt = 0;
        int state = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            state = (ch < 128) ? ac.nodes.get(state).next[ch] : 0;
            cnt += ac.nodes.get(state).outputs.size();
        }
        return cnt;
    }
}
