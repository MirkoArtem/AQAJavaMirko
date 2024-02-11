package Lesson_9.Task_1_2_3;

import java.util.ArrayList;

public class StringCollection {
    public static void stringCollection() {
        String[] words = {"Highload", "High", "Load", "Highload"};
        ArrayList<String> arrayList = new ArrayList<>(words.length);

        for (int i = 0; i < words.length; i++) {
            arrayList.add(i, words[i]);
        }
        System.out.println("\n" + "Коллекция: ");
        System.out.println(arrayList);

        System.out.println("Количетво объектов 'High' в коллекции: " + arrayList.stream().filter("High"::equals).count() + ";");
        System.out.println("Элемент коллекции находящийся на первом месте: '" + arrayList.stream().findFirst().orElse("0") + "';");
        System.out.println("Элемент коллекции находящийся на последнем месте: '" +
                arrayList.stream().skip(arrayList.size() - 1).findFirst().orElse("0") + "';");
    }
}