package com.igorkan.modules.union_find_rollback_java;

public final class Types {
    public record UndoStep(int child, int oldRootSize) {}
}
