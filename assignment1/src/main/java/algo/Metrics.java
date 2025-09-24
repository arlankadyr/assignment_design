package algo;

public class Metrics {
    public static long comparisons = 0;
    public static long allocations = 0;
    public static int recursionDepth = 0;

    public static void reset() {
        comparisons = 0;
        allocations = 0;
        recursionDepth = 0;
    }
}
