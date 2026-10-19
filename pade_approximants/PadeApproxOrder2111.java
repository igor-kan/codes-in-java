package pade_approximants;

/** rational function approximant order 2111 */
public final class PadeApproxOrder2111 {
    public static double compute(double x) {
        return (1.0 + x * 3.0) / (1.0 + x * x * 2.0);
    }
}
