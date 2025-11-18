package Lab_8.Task_1;

public class Animal {
    String type;
    String name;
    double height;
    double weight;
    String color;

    public Animal(String type, String name, double height, double weight, String color) {
        this.type = type;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }
    public void eat() {
        System.out.println("Actions:\n" + this.name + " eats");
    }
    public void sleep() {
        System.out.println(this.name + " sleeps");
    }
    public void makeSound() {}

    public void displayInfo() {
        System.out.println("Properties:\nName: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Height: " + this.height + " м");
        System.out.println("Weight: " + this.weight + " кг\n");
    }
}