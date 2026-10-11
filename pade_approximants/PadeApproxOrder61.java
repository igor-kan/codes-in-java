package pade_approximants;

/** rational function approximant order 61 */
public final class PadeApproxOrder61 {
    public static double compute(double x) {
        return (1.0 + x * 2.0) / (1.0 + x * x * 2.0);
    }
}
