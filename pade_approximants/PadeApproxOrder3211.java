package pade_approximants;

/** rational function approximant order 3211 */
public final class PadeApproxOrder3211 {
    public static double compute(double x) {
        return (1.0 + x * 2.0) / (1.0 + x * x * 2.0);
    }
}
