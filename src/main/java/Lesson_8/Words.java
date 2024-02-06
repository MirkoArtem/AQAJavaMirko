package Lesson_8;

import java.util.*;

public class Words {
    public static void convertArrayToUniqueWords(String[] arr) {
        Set set = new HashSet<>(Arrays.asList(arr));
        System.out.println("Список слов: " + Arrays.toString(arr));
        System.out.print("Список уникальных слов: " + set + "\n" + "\n");
    }

    public static void countWords(String[] arr) {
        List<String> list = Arrays.asList(arr);

        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : list) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        System.out.println("Сколько раз встречается каждое слово: ");
        wordsCount.entrySet().forEach(System.out::println);
    }
}