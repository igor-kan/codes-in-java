package pade_approximants;

/** rational function approximant order 1701 */
public final class PadeApproxOrder1701 {
    public static double compute(double x) {
        return (1.0 + x * 1.0) / (1.0 + x * x * 2.0);
    }
}
