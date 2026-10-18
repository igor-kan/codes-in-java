package pade_approximants;

/** rational function approximant order 1946 */
public final class PadeApproxOrder1946 {
    public static double compute(double x) {
        return (1.0 + x * 3.0) / (1.0 + x * x * 1.0);
    }
}
