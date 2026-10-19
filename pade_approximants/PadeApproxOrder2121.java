package pade_approximants;

/** rational function approximant order 2121 */
public final class PadeApproxOrder2121 {
    public static double compute(double x) {
        return (1.0 + x * 1.0) / (1.0 + x * x * 2.0);
    }
}
