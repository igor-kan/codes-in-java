package com.igorkan.modules.rope_balanced_text;

public interface Contract {
    Types.RopeNode concat(Types.RopeNode a, Types.RopeNode b);
    char charAt(Types.RopeNode root, int index);
    Types.RopeNode[] split(Types.RopeNode root, int index);
}
