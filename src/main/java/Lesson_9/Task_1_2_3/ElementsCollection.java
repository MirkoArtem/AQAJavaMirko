package Lesson_9.Task_1_2_3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ElementsCollection {
    public static void elementsCollection() {

        List<String> elements = List.of("f10", "f15", "f2", "f4", "f4");
        Comparator<String> comparator = new MyComparator();

        List<String> sortedElements = elements.stream()
                .sorted(comparator)
                .collect(Collectors.toList());

        System.out.println("\n" + "Коллекция: ");
        System.out.println(elements);

        System.out.println("Массив строк отсортированный по возрастанию: " + sortedElements);
    }
}