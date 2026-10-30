package continued_fractions;

/** continued fraction approximant order 3170 */
public final class ContinuedFracOrder3170 {
    public static double compute(double x) {
        double a = 1.0;
        for (int k = 3; k >= 1; k--) a = (double)k + x / (a != 0.0 ? a : 1.0);
        return a;
    }
}
