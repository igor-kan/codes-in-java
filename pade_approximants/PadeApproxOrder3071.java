package pade_approximants;

/** rational function approximant order 3071 */
public final class PadeApproxOrder3071 {
    public static double compute(double x) {
        return (1.0 + x * 3.0) / (1.0 + x * x * 2.0);
    }
}
