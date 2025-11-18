package Lab_9.Task_2;

public class Duck implements Swimmable, Flyable, Living {

    private boolean isSwimming = false;
    private boolean isFlying = false;

    @Override
    public void swim() {
        if (!isSwimming) {
            this.isSwimming = true;
            System.out.println("Duck starts swimming. Quack!");
        } else {
            System.out.println("Duck is already swimming.");
        }
    }

    @Override
    public void stopSwimming() {
        if (isSwimming) {
            this.isSwimming = false;
            System.out.println("Duck gets out of the water.");
        } else {
            System.out.println("Duck is not swimming.");
        }
    }

    @Override
    public void fly() {
        if (!isFlying) {
            this.isFlying = true;
            System.out.println("Duck starts flying. Flap-flap!");
        } else {
            System.out.println("Duck is already flying.");
        }
    }

    @Override
    public void stopFlying() {
        if (isFlying) {
            this.isFlying = false;
            System.out.println("Duck lands.");
        } else {
            System.out.println("Duck is not flying.");
        }
    }

}