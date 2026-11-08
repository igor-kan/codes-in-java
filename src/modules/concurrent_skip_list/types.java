package modules.concurrent_skip_list;

/**
 * Core type specifications and interfaces for Lock-Free Concurrent Skip List Ordered Map.
 * Module: concurrent_skip_list
 */
public final class ModuleTypes {
    public static final int ALIGNMENT = 64;

    public record Config(int capacity, double tolerance, int maxIterations) {
        public Config() {
            this(1024, 1e-12, 1000);
        }
    }

    public enum Status {
        SUCCESS,
        INVALID_ARGUMENT,
        OUT_OF_BOUNDS,
        CONVERGENCE_ERROR
    }

    public static final class Context {
        private final Config config;
        private long operationsCount;

        public Context(Config config) {
            this.config = config != null ? config : new Config();
            this.operationsCount = 0;
        }

        public Config getConfig() { return config; }
        public long getOperationsCount() { return operationsCount; }
        public void incrementOperations() { operationsCount++; }
    }
}
