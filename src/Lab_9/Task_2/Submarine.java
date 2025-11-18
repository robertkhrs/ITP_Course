package Lab_9.Task_2;


public class Submarine implements Swimmable {
    private boolean isSwimming = false;

    @Override
    public void swim() {
        if (!isSwimming) {
            this.isSwimming = true;
            System.out.println("Submarine starts moving.");
        } else {
            System.out.println("Submarine is already moving.");
        }
    }

    @Override
    public void stopSwimming() {
        if (isSwimming) {
            this.isSwimming = false;
            System.out.println("Submarine stops.");
        } else {
            System.out.println("Submarine is not moving.");
        }
    }
}