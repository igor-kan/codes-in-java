package continued_fractions;

/** continued fraction approximant order 1030 */
public final class ContinuedFracOrder1030 {
    public static double compute(double x) {
        double a = 1.0;
        for (int k = 5; k >= 1; k--) a = (double)k + x / (a != 0.0 ? a : 1.0);
        return a;
    }
}
