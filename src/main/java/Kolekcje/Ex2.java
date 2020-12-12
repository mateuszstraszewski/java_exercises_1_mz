package Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        Integer i1 = 3;
        Integer i2 = 4;
        Integer i3 = 5;

        List<Integer> numbers = new ArrayList<>();

        numbers.add(i1);
        numbers.add(i2);
        numbers.add(i3);

        System.out.println(numbers.size());
        System.out.println(numbers.get(numbers.size() - 1));

    }
}
