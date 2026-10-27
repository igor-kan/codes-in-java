package pade_approximants;

/** rational function approximant order 3006 */
public final class PadeApproxOrder3006 {
    public static double compute(double x) {
        return (1.0 + x * 1.0) / (1.0 + x * x * 1.0);
    }
}
