package Lab_12.Exercise_2;
import java.util.Objects;

public class Animal {
    private String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public void voice() {
        System.out.println("I'm voice");
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nickname, animal.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }

    @Override
    public String toString() {
        return "Animal{name='" + nickname + "'}";
    }
}