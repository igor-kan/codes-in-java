package pade_approximants;

/** rational function approximant order 1411 */
public final class PadeApproxOrder1411 {
    public static double compute(double x) {
        return (1.0 + x * 2.0) / (1.0 + x * x * 2.0);
    }
}
