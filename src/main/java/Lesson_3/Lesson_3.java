package Lesson_3;

import java.util.Arrays;

public class Lesson_3 {
    public static void main(String[] args) {
        twoNumbersInRange(5, 6);
        positiveOrNegativeNumberInConsole();
        positiveOrNegativeNumber(-10);
        txtInConsole(3, "Artem");
        leapYear(2024);
        changeArr();
        fillingArr();
        changeNumbersInArrBeforeSix();
        squareArr();
        twoArguments(10, 13);
    }

    public static int twoNumbersInRange(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return sum;
    }

    public static void positiveOrNegativeNumberInConsole() {
        int a = 0;
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static int positiveOrNegativeNumber(int a) {
        if (a >= 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
        return a;
    }

    public static String txtInConsole(int i, String str) {
        String result = "";
        for (int a = 0; a < i; a++) {
            result = result + str + "\n";
        }
        System.out.println(result);
        return result;
    }

    public static boolean leapYear(int year) {
        boolean result = (year > 1584 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return result;
    }

    public static void changeArr() {
        int[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int lenght = nums.length;
        for (int i = 0; i < lenght; i++) {
            if (nums[i] == 1) {
                nums[i] = 0;
            } else if (nums[i] == 0) {
                nums[i] = 1;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void fillingArr() {
        int[] numbers = new int[100];
        numbers[0] = 1;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void changeNumbersInArrBeforeSix() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int lenght = array.length;
        for (int i = 0; i < lenght; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void squareArr() {
        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                    if (i == j) {
                        table[i][j] = 1;
                    } else if (j == table.length - 1 - i){
                        table[i][j] = 1;
                    }
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int[] twoArguments (int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}



