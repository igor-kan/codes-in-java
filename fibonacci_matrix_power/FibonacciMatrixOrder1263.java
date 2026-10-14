package fibonacci_matrix_power;

/** fibonacci matrix power recurrence order 1263 */
public final class FibonacciMatrixOrder1263 {
    public static double compute(double x) {
        double f0 = 1.0, f1 = 1.0;
        for (int i = 0; i < 4; i++) { double nx = f0 + f1 * x * 0.1; f0 = f1; f1 = nx; }
        return f1;
    }
}
