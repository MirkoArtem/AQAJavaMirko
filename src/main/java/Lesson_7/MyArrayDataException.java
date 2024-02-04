package Lesson_7;

public class MyArrayDataException extends MyCustomExceptions{
    public MyArrayDataException(int row, int col) {
        super(String.format("Неверные данные находятся в ячейке [%d, %d]\n", row, col));
    }
}