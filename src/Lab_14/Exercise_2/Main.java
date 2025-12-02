package Lab_14.Exercise_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple1");
        strings.add("ba3nana");
        strings.add("123");
        strings.add("oran4ge");

        strings.addAll(new ArrayList<>(strings));

        System.out.println("An array with duplicates and numbers: " + strings);

        List<String> result = strings.stream()
                .map(s -> s.replaceAll("\\d", ""))
                .filter(s -> !s.isEmpty())
                .distinct()
                .sorted()

                .collect(Collectors.toList());

        System.out.println("Resulted array: " + result);
    }
}
