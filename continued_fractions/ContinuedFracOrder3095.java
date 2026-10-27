package continued_fractions;

/** continued fraction approximant order 3095 */
public final class ContinuedFracOrder3095 {
    public static double compute(double x) {
        double a = 1.0;
        for (int k = 6; k >= 1; k--) a = (double)k + x / (a != 0.0 ? a : 1.0);
        return a;
    }
}
