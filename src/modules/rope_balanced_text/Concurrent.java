package com.igorkan.modules.rope_balanced_text;

import java.util.List;

public final class Concurrent {
    private Concurrent() {}

    public static String parallelJoin(List<Types.RopeNode> chunks) {
        return chunks.parallelStream().map(FastPath::flatten).reduce("", String::concat);
    }
}
