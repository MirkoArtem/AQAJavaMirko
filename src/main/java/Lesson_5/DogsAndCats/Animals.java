package Lesson_5.DogsAndCats;

public abstract class Animals {
    public String name;
    private static int createdCounter;

    public Animals() {
        this.name = name;
        createdCounter++;
    }

    public static int getCreatedCounter() {
        return createdCounter;
    }

    public abstract void run(int distanceRun);

    public abstract void swim(int distanceSwim);
}