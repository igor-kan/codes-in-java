package pade_approximants;

/** rational function approximant order 1456 */
public final class PadeApproxOrder1456 {
    public static double compute(double x) {
        return (1.0 + x * 2.0) / (1.0 + x * x * 1.0);
    }
}
