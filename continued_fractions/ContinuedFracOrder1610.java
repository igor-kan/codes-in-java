package continued_fractions;

/** continued fraction approximant order 1610 */
public final class ContinuedFracOrder1610 {
    public static double compute(double x) {
        double a = 1.0;
        for (int k = 3; k >= 1; k--) a = (double)k + x / (a != 0.0 ? a : 1.0);
        return a;
    }
}
