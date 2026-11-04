package continued_fractions;

/** continued fraction approximant order 3580 */
public final class ContinuedFracOrder3580 {
    public static double compute(double x) {
        double a = 1.0;
        for (int k = 5; k >= 1; k--) a = (double)k + x / (a != 0.0 ? a : 1.0);
        return a;
    }
}
