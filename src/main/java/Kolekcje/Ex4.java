package Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        String name1 = "John";
        String name2 = "Mike";
        String name3 = "David";
        String name4 = "Clint";
        String name5 = "Cliff";

        List<String> names = new ArrayList<>();

        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);
        names.add(name5);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
    }
}
