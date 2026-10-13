package pade_approximants;

/** rational function approximant order 1001 */
public final class PadeApproxOrder1001 {
    public static double compute(double x) {
        return (1.0 + x * 3.0) / (1.0 + x * x * 2.0);
    }
}
