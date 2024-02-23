package Lesson_12_testng;

public class Factorial {
    public long calculateFactorial(int n) {

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
