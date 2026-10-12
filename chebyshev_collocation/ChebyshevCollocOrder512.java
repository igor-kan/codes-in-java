package chebyshev_collocation;

/** chebyshev collocation node order 512 */
public final class ChebyshevCollocOrder512 {
    public static double compute(double x) {
        return Math.cos(Math.PI * 2.0 / 3.0) * x;
    }
}
