package Lesson_5.DogsAndCats;

public class Cat extends Animals {
    private final int maxDistanceRun;
    private static int createdCounter;
    private boolean satiety;

    public Cat(String name) {
        this.name = name;
        createdCounter++;
        this.maxDistanceRun = 200;
        this.satiety = false;
    }

    @Override
    public void run(int distanceRun) {
        if (distanceRun > maxDistanceRun) {
            System.out.println("Кот не может пробежать более " + maxDistanceRun + " м.");
        } else {
            System.out.println("Кот " + name + " пробежал " + distanceRun + " м.");
        }
    }

    @Override
    public void swim(int distanceSwim) {
        System.out.println("Кот не умеет плавать!");
    }

    public void eatFromBowl() {
        if (satiety) {
            System.out.println("Кот " + name + " поел!");
            satiety = false;
        } else {
            System.out.println("Кот " + name + " не голоден!");
        }
    }

    public void setSatiety() {
        satiety = true;
    }

    public boolean satiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public static int getCreatedCounter() {
        return createdCounter;
    }
}