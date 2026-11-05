package pade_approximants;

/** rational function approximant order 3621 */
public final class PadeApproxOrder3621 {
    public static double compute(double x) {
        return (1.0 + x * 1.0) / (1.0 + x * x * 2.0);
    }
}
