package chebyshev_collocation;

/** chebyshev collocation node order 7 */
public final class ChebyshevCollocOrder7 {
    public static double compute(double x) {
        return Math.cos(Math.PI * 7.0 / 8.0) * x;
    }
}
