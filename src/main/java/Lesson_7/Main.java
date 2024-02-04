package Lesson_7;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "1", "1", "1",},
                {"2", "2", "2", "2"},
                {"10", "8", "6", "4"},
                {"1", "1", "A", "2"},
        };
        String[][] arr1 = {
                {"1", "1", "1", "1",},
                {"2", "2", "2", "2"},
                {"10", "8", "6", "4"},
                {"1", "1", "3", "1", "2"},
        };
        String[][] arr2 = {
                {"1", "1", "1", "1",},
                {"2", "2", "2", "2"},
                {"10", "8", "6", "4"},
                {"1", "1", "3", "1"},
        };
        try {
            ArrayExceptions.myArrayDataException(arr);
        } catch (MyCustomExceptions e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
        try {
            ArrayExceptions.myArraySizeException(arr1);
        } catch (MyCustomExceptions e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
        try {
            System.out.println("Сумма всех элементов массива равна: " + ArrayExceptions.myArrayDataException(arr2));
        } catch (MyCustomExceptions e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
    }
}