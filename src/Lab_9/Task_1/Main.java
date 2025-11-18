package Lab_9.Task_1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Human steve = new Human();
        Dog sharik = new Dog();
        Alien zorp = new Alien();

        System.out.println(" - birth - ");
        steve.bear("Steve");
        sharik.bear("Rex");
        zorp.bear("Zorp");

        System.out.println(" - die - ");
        steve.die();
        sharik.die();

        System.out.println("\nSteve is alive: " + steve.isAlive);
    }
}