package com.igorkan.modules.astar_grid_heuristic;

public final class Errors {
    private Errors() {}

    public static final class AStarException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public AStarException(String message) {
            super(message);
        }
    }

    public static void require(boolean cond, String msg) {
        if (!cond) {
            throw new AStarException(msg);
        }
    }
}
