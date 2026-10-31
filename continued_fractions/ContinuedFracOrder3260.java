package continued_fractions;

/** continued fraction approximant order 3260 */
public final class ContinuedFracOrder3260 {
    public static double compute(double x) {
        double a = 1.0;
        for (int k = 3; k >= 1; k--) a = (double)k + x / (a != 0.0 ? a : 1.0);
        return a;
    }
}
