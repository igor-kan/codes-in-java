package chebyshev_collocation;

/** chebyshev collocation node order 52 */
public final class ChebyshevCollocOrder52 {
    public static double compute(double x) {
        return Math.cos(Math.PI * 2.0 / 3.0) * x;
    }
}
