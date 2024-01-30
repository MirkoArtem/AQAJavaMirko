package Lesson_5.DogsAndCats;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("В миску добавлено " + amount + " еды");
        }
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("В миске недостаточно еды!");
        }
    }

    public int getFood() {
        return food;
    }
}