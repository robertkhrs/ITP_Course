package Lab_8.Task_1;

import java.util.ArrayList;

public class Task1 {
    static void main() {

        Cow myCow = new Cow("COW", "Burka", 1.5, 500, "Brown");
        Cat myCat = new Cat("CAT","Rigby", 0.3, 4.2, "Orange");
        Dog myDog = new Dog("DOG", "Sharik", 0.7, 25.5, "Black");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(myCow);
        animals.add(myCat);
        animals.add(myDog);

        for (Animal animal : animals) {
            System.out.println("\n- " + animal.type + " -\n");
            animal.displayInfo();
            animal.eat();
            animal.sleep();
            animal.makeSound();
        }
    }
}