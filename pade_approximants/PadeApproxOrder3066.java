package pade_approximants;

/** rational function approximant order 3066 */
public final class PadeApproxOrder3066 {
    public static double compute(double x) {
        return (1.0 + x * 1.0) / (1.0 + x * x * 1.0);
    }
}
