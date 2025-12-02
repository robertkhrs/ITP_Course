package Lab_12.Exercise_2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Animal> animals = new HashSet<Animal>();
        Set<Cat> cats = new HashSet<>();
        Set<Dog> dogs = new HashSet<>();

        animals.add(new Animal("Generic beast"));
        cats.add(new Cat("Barsik", 10));
        cats.add(new Cat("Murzik", 5));
        dogs.add(new Dog("Rex", 50));
        dogs.add(new Dog("Mukhtar", 60));

        System.out.println("--- Display Animals (Reads from Set<Animal>) ---");
        displayAnimals(animals);

        System.out.println("\n--- Display Cats (Reads from Set<Cat>) ---");
        displayAnimals(cats);

        System.out.println("\n--- Make Dogs Talk ---");
        makeTalk(dogs);

        System.out.println("\n--- Add Animals (Writes to Set<Animal>) ---");
        addAnimals(animals);
        displayAnimals(animals);
    }
    public static void displayAnimals(Set<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
    public static void makeTalk(Set<? extends Animal> animals) {
        for (Animal a : animals) {
            a.voice();
        }
    }
    public static void addAnimals(Set<? super Animal> destination) {
        destination.add(new Cat("NewCat", 8));
        destination.add(new Dog("NewDog", 20));
        destination.add(new Animal("NewAnimal"));

        System.out.println("Added 3 new animals to the set.");
    }
}
