package Lesson_10;

import Lesson_10.Apple;
import Lesson_10.Box;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Orange orange1 = new Orange();

        Box<Apple> boxApple = new Box<>();
        boxApple.addFruit(apple1);
        boxApple.addFruit(apple1);
        boxApple.addFruit(apple1);
        boxApple.addFruit(apple1);

        Box<Orange> boxOrange = new Box<>();
        boxOrange.addFruit(orange1);
        boxOrange.addFruit(orange1);
        boxOrange.addFruit(orange1);
        boxOrange.addFruit(orange1);
        boxOrange.addFruit(orange1);

        System.out.println("Вес коробки с яблоками: " + boxApple.getWeight() + " кг.");
        System.out.println("Вес коробки с апельсинами: " + boxOrange.getWeight() + " кг." + "\n");

        System.out.println("Сравнение веса двух коробок (true - если их вес равен, false - если их вес не равен):" + "\n"
                + boxApple.compare(boxOrange) + ";" + "\n");

        Box<Apple> boxAppleNew = new Box<>();
        boxAppleNew.addFruit(apple1);
        boxAppleNew.addFruit(apple1);
        boxAppleNew.addFruit(apple1);

        boxApple.transfer(boxAppleNew);

        System.out.println("Вес первой коробки с яблоками после того, как их пересыпали в новую коробку: " + boxApple.getWeight() + " кг.");
        System.out.println("Вес новой коробки с яблоками после того, как в нее пересыпали яблоки из первой коробки: "
                + boxAppleNew.getWeight() + " кг.");
    }
}