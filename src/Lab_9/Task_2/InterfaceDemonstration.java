package Lab_9.Task_2;

public class InterfaceDemonstration {
     static void main(String[] args) {

        System.out.println("--- DUCK ---");
        Duck ducky = new Duck();
        ducky.live();
        ducky.fly();
        ducky.fly();
        ducky.swim();
        ducky.stopFlying();

        System.out.println("\n--- PENGUIN ---");
        Penguin pingu = new Penguin();
        pingu.live();
        pingu.swim();

        System.out.println("\n--- SUBMARINE ---");
        Submarine sub = new Submarine();
        sub.stopSwimming();
        sub.swim();
    }
}
