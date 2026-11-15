package com.igorkan.modules.bplus_order_map;

import java.util.ArrayList;
import java.util.List;

public final class Types {
    private Types() {}

    public sealed interface BNode permits Leaf, Internal {}

    public static final class Leaf implements BNode {
        public final List<Long> keys = new ArrayList<>();
        public final List<String> vals = new ArrayList<>();
        public Leaf next = null;
    }

    public static final class Internal implements BNode {
        public final List<Long> keys = new ArrayList<>();
        public final List<BNode> children = new ArrayList<>();
    }

    public record SplitUp(long promoKey, BNode right) {}
}
