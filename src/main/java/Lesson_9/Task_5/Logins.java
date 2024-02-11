package Lesson_9.Task_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Logins {
    public static void loginsFromKeyboard(){
        Scanner scanner = new Scanner(System.in);
        String s;
        ArrayList<String> allLogins = new ArrayList<>();

        System.out.println("Введите логин");
        while (true) {
            System.out.println("Логин: ");
            s = scanner.nextLine();
            if (s.equals(""))
                break;
            allLogins.add(s);
        }
        System.out.println();

        System.out.println("Все введенные логины: " + allLogins);

        Predicate<String> fn;
        fn = (str) -> {
            if (str.charAt(0) == 'f')
                return true;
            return false;
        };

        Stream<String> stream = allLogins.stream();
        Stream<String> resStream = stream.filter(fn);
        System.out.println("Все логины начинающиеся на строчную букву 'f': " + Arrays.toString(resStream.toArray()));
    }
}
