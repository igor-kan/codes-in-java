package pade_approximants;

/** rational function approximant order 1211 */
public final class PadeApproxOrder1211 {
    public static double compute(double x) {
        return (1.0 + x * 3.0) / (1.0 + x * x * 2.0);
    }
}
