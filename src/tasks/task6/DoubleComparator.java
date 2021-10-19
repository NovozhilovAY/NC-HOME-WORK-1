package tasks.task6;

public class DoubleComparator {
    private static final double EPS = 0.000001d;

    private DoubleComparator(){}

    public static boolean equal(double num1, double num2) {
        if(Math.abs(num1-num2) < EPS)
            return true;
        else
            return false;
    }
}
