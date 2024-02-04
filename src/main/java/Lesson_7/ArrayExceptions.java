package Lesson_7;

public class ArrayExceptions {

    public static void myArraySizeException(String[][] arr) {
        if (arr.length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4х4");
        }
        for (String[] strings : arr) {
            if (strings.length != 4) {
                throw new MyArraySizeException("Массив должен быть размером 4х4");
            }
        }
    }

    public static int myArrayDataException(String[][] arr) {
        int sum = 0;
        if (arr.length != 4) throw new MyArraySizeException("Массив должен быть размером 4х4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException("Массив должен быть размером 4х4");
            for (int k = 0; k < arr[i].length; k++) {
                try {
                    sum += Integer.parseInt(arr[i][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, k);
                }
            }
        }
        return sum;
    }
}