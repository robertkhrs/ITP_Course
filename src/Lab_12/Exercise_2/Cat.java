package Lab_12.Exercise_2;

public class Cat extends Animal {
    private int purLoudness;

    public Cat(String name, int purLoudness) {
        super(name);
        this.purLoudness = purLoudness;
    }

    @Override
    public void voice() {
        System.out.println("Meow! (Loudness: " + purLoudness + ")");
    }

    @Override
    public String toString() {
        return "Cat{name='" + getNickname() + "', purLoudness=" + purLoudness + "}";
    }
}