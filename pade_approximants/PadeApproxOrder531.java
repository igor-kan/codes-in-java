package pade_approximants;

/** rational function approximant order 531 */
public final class PadeApproxOrder531 {
    public static double compute(double x) {
        return (1.0 + x * 1.0) / (1.0 + x * x * 2.0);
    }
}
