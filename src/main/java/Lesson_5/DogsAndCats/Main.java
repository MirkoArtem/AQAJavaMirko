package Lesson_5.DogsAndCats;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Боня");
        dog1.run(200);

        Dog dog2 = new Dog("Люська");
        dog2.swim(10);

        Dog dog3 = new Dog("Бобик");
        dog3.run(501);

        Dog dog4 = new Dog("Барбос");
        dog4.swim(11);

        System.out.println("Всего собак: " + Dog.getCreatedCounter() + ".");

        Cat cat1 = new Cat("Сева");
        cat1.run(150);

        Cat cat2 = new Cat("Сеня");
        cat2.run(201);

        Cat cat3 = new Cat("Бабосик");
        cat3.swim(150);

        System.out.println("Всего котов: " + Cat.getCreatedCounter() + ".");
        System.out.println("Всего животных: " + Animals.getCreatedCounter() + ".");
        System.out.println();

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Пушок");
        cats[1] = new Cat("Барсик");
        cats[2] = new Cat("Кузя");
        cats[3] = new Cat("Дипутат");
        cats[4] = new Cat("Кабан");

        Bowl bowl = new Bowl(10);

        for (Cat cat : cats) {
            cat.setSatiety();
            cat.eatFromBowl();
            bowl.decreaseFood(10);
            System.out.println("Количество еды в миске: " + bowl.getFood());
            System.out.println("Кот " + cat.getName() + " голоден: " + cat.satiety());
            bowl.addFood(3);
            System.out.println("Количество еды в миске: " + bowl.getFood());
            System.out.println();
        }
    }
}