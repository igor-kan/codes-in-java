package pade_approximants;

/** rational function approximant order 31 */
public final class PadeApproxOrder31 {
    public static double compute(double x) {
        return (1.0 + x * 2.0) / (1.0 + x * x * 2.0);
    }
}
