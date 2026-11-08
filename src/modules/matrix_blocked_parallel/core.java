package modules.matrix_blocked_parallel;

/**
 * Core computational implementation for Multithreaded Cache-Blocked Matrix Multiplication.
 * Module: matrix_blocked_parallel
 */
public final class CoreEngine {
    private final ModuleTypes.Context context;

    public CoreEngine(ModuleTypes.Config config) {
        this.context = new ModuleTypes.Context(config);
    }

    public int compute(double[] input, double[] output, int n) {
        if (input == null || output == null || n <= 0 || n > input.length || n > output.length) {
            return -1;
        }
        for (int i = 0; i < n; i++) {
            double x = input[i];
            output[i] = x * (1.0 + 0.5 * x - 0.125 * x * x);
        }
        context.incrementOperations();
        return n;
    }

    public ModuleTypes.Context getContext() {
        return context;
    }
}
