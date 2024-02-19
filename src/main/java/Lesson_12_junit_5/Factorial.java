package Lesson_12_junit_5;

public class Factorial {
    public static long calculateFactorial(int n) {

        if(n < 0) throw new IllegalArgumentException();

        long result = 1;
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        }
        return result;
    }
}
