package Lesson_5.DogsAndCats;

public class Dog extends Animals {

    private final int maxDistanceRun;
    private final int maxDistanceSwim;
    private static int createdCounter;

    public Dog(String name) {
        this.name = name;
        createdCounter++;
        this.maxDistanceRun = 500;
        this.maxDistanceSwim = 10;
    }

    @Override
    public void run(int distanceRun) {
        if (distanceRun > maxDistanceRun) {
            System.out.println("Собака не может пробежать более " + maxDistanceRun + " м.");
        } else {
            System.out.println("Собака " + name + " пробежал/a " + distanceRun + " м.");
        }
    }

    @Override
    public void swim(int distanceSwim) {
        if (distanceSwim > maxDistanceSwim) {
            System.out.println("Собака не может проплыть более " + maxDistanceSwim + " м.");
        } else {
            System.out.println("Собака " + name + " проплыл/а " + distanceSwim + " м.");
        }
    }

    public static int getCreatedCounter() {
        return createdCounter;
    }
}