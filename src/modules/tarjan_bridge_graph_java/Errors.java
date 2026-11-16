package com.igorkan.modules.tarjan_bridge_graph_java;

public final class Errors {
    private Errors() {}

    public static final class BridgeException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public BridgeException(String message) {
            super(message);
        }
    }

    public static void require(boolean cond, String msg) {
        if (!cond) {
            throw new BridgeException(msg);
        }
    }
}
