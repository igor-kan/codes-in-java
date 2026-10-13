package pade_approximants;

/** rational function approximant order 1026 */
public final class PadeApproxOrder1026 {
    public static double compute(double x) {
        return (1.0 + x * 1.0) / (1.0 + x * x * 1.0);
    }
}
