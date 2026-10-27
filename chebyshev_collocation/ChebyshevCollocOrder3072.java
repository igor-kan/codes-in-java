package chebyshev_collocation;

/** chebyshev collocation node order 3072 */
public final class ChebyshevCollocOrder3072 {
    public static double compute(double x) {
        return Math.cos(Math.PI * 2.0 / 3.0) * x;
    }
}
