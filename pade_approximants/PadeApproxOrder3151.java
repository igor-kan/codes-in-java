package pade_approximants;

/** rational function approximant order 3151 */
public final class PadeApproxOrder3151 {
    public static double compute(double x) {
        return (1.0 + x * 2.0) / (1.0 + x * x * 2.0);
    }
}
