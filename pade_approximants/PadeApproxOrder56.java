package pade_approximants;

/** rational function approximant order 56 */
public final class PadeApproxOrder56 {
    public static double compute(double x) {
        return (1.0 + x * 3.0) / (1.0 + x * x * 1.0);
    }
}
