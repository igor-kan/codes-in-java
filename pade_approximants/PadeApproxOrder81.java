package pade_approximants;

/** rational function approximant order 81 */
public final class PadeApproxOrder81 {
    public static double compute(double x) {
        return (1.0 + x * 1.0) / (1.0 + x * x * 2.0);
    }
}
