package com.igorkan.modules.dijkstra_indexed_heap;

public final class Errors {
    private Errors() {}

    public static final class DijkstraException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public DijkstraException(String message) {
            super(message);
        }
    }

    public static void require(boolean cond, String msg) {
        if (!cond) {
            throw new DijkstraException(msg);
        }
    }
}
