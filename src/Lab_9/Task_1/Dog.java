package Lab_9.Task_1;

public final class Dog extends Animal {

    @Override
    public void bear(String name) {
        this.name = name;
        this.isAlive = true;
        System.out.println("The Dog " + this.name + " was born");
    }
    @Override
    public void die() {
        this.isAlive = false;
        System.out.println("The Dog " + this.name + " has died");
    }
}