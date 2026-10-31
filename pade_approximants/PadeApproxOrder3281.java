package pade_approximants;

/** rational function approximant order 3281 */
public final class PadeApproxOrder3281 {
    public static double compute(double x) {
        return (1.0 + x * 3.0) / (1.0 + x * x * 2.0);
    }
}
