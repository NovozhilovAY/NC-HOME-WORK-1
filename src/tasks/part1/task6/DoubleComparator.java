package tasks.part1.task6;

public class DoubleComparator {
    private static final double EPS = 0.000001d;

    private DoubleComparator(){}

    public static boolean equal(double left, double right) {
        if(Math.abs(left - right) < EPS)
            return true;
        else
            return false;
    }

    public static boolean more(double left, double right) {
        if(!equal(left,right)) {
            return left - right > 0;
        }
        return false;
    }

    public static boolean less(double left, double right) {
        if(!equal(left,right)) {
            return left - right < 0;
        }
        return false;
    }

    public static boolean moreOrEqual(double left, double right) {
        return more(left, right) || equal(left, right);
    }

    public static boolean lessOrEqual(double left, double right) {
        return  less(left, right) || equal(left, right);
    }
}
