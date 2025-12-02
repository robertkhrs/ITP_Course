package Lab_14.Exercise_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(100) - 50);
        }

        System.out.println("Random numbers: " + numbers);

        System.out.println("Result:");
        numbers.stream()
                .filter(n -> n % 3 == 0)
                .map(Math::abs)
                .forEach(System.out::println);
    }
}