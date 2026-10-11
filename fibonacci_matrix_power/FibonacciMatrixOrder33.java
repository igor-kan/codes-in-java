package fibonacci_matrix_power;

/** fibonacci matrix power recurrence order 33 */
public final class FibonacciMatrixOrder33 {
    public static double compute(double x) {
        double f0 = 1.0, f1 = 1.0;
        for (int i = 0; i < 10; i++) { double nx = f0 + f1 * x * 0.1; f0 = f1; f1 = nx; }
        return f1;
    }
}
