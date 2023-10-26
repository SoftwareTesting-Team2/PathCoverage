public class PathCoverage {

    public long returnInput(long x, boolean c1,
                            boolean c2,
                            boolean c3) {

        if (c1) {
            x++;
        }

        if (c2) {
            x++;
        }

        if (c3) {
            x++;
        }

        return x;

        // requirement: x should return 4
    }

}