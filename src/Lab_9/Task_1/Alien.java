package Lab_9.Task_1;

public class Alien extends Creature {

    @Override
    public void bear(String name) {
        this.name = name;
        this.isAlive = true;
        System.out.println("The Alien " + this.name + " was born");
    }
    @Override
    public void die() {
        this.isAlive = false;
        System.out.println("The Human " + this.name + " has died");
    }
}