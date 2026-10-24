package continued_fractions;

/** continued fraction approximant order 2790 */
public final class ContinuedFracOrder2790 {
    public static double compute(double x) {
        double a = 1.0;
        for (int k = 1; k >= 1; k--) a = (double)k + x / (a != 0.0 ? a : 1.0);
        return a;
    }
}
