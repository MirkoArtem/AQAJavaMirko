package Lesson_5.GeometricFigures;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        circle.setFillColor("Pink");
        circle.setBorderColor("Black");
        circle.printCharacteristics();

        Rectangle rectangle = new Rectangle(8, 10);
        rectangle.setFillColor("Red");
        rectangle.setBorderColor("Black");
        rectangle.printCharacteristics();

        Triangle triangle = new Triangle(8, 10, 12);
        triangle.setFillColor("Yellow");
        triangle.setBorderColor("Black");
        triangle.printCharacteristics();
    }
}
