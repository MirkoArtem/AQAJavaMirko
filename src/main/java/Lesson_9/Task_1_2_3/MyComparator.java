package Lesson_9.Task_1_2_3;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {
    @Override
    public int compare(String firstString, String secondString) {
        Character firstElement = firstString.charAt(0);
        Character secondElement = secondString.charAt(0);

        Integer firstNumber = Integer.parseInt(firstString.substring(1));
        Integer secondNumber = Integer.parseInt(secondString.substring(1));

        if (firstElement.equals(secondElement)) {
            return firstNumber - secondNumber;
        } else {
            return firstElement.compareTo(secondElement);
        }
    }
}