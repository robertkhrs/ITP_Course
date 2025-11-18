package Lab_8.Task_2;

public class Task2 {
    public static void main(String[] args) {
        Shapes[] shapes = {
                new Rectangle(10, 5),
                new Square(7),
                new Triangle(3, 4, 5),
                new Ellipse(10, 5),
                new Circle(8)
        };
        for (Shapes shape : shapes) {
            System.out.println("--- Shape: " + shape.getClass().getSimpleName() + " ---");

            System.out.printf("Area: %.2f\n", shape.calculateArea());
            System.out.printf("Perimeter: %.2f\n", shape.calculatePerimeter());
            System.out.println();
        }
    }
}