package Lab_9.Task_2;


public class Penguin implements Swimmable, Living {

    private boolean isSwimming = false;

    @Override
    public void swim() {
        if (!isSwimming) {
            this.isSwimming = true;
            System.out.println("Penguin dives and swims.");
        } else {
            System.out.println("Penguin is already swimming.");
        }
    }

    @Override
    public void stopSwimming() {
        if (isSwimming) {
            this.isSwimming = false;
            System.out.println("Penguin gets out of the water.");
        } else {
            System.out.println("Penguin is not swimming.");
        }
    }

}
