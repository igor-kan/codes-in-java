package spherical_harmonics_terms;

/** spherical harmonic radial component order 4 */
public final class SphericalHarmOrder4 {
    public static double compute(double x) {
        return Math.pow(x, 5) / (double)(10);
    }
}
