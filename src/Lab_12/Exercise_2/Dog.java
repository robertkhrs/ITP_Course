package Lab_12.Exercise_2;

public class Dog extends Animal {
    private int barkingLoudness;

    public Dog(String name, int barkingLoudness) {
        super(name);
        this.barkingLoudness = barkingLoudness;
    }

    @Override
    public void voice() {
        System.out.println("Gaw! (Loudness: " + barkingLoudness + ")");
    }

    @Override
    public String toString() {
        return "Dog{name='" + getNickname() + "', barkingLoudness=" + barkingLoudness + "}";
    }
}