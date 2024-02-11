package Lesson_9.Task_1_2_3;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    public static void randomNumbers() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int numbers;
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            numbers = rnd.nextInt() % 100;
            arrayList.add(numbers);
        }
        System.out.println("\n" + "Случайный массив чисел: ");
        System.out.println(arrayList);

        int pairedNum = (int) (arrayList.stream().filter((i) -> (i % 2) == 0)).count();
        System.out.println("Количество четных чисел: " + pairedNum + ";");
    }

}
