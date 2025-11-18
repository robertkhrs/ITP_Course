package Lab_8.Task_1;

class Cat extends Animal {
    public Cat(String type, String name, double height, double weight, String color) {
        super(type, name, height, weight, color);
    }
    @Override
    public void makeSound() {
        System.out.println(this.name + " talks: Meow");
    }
}