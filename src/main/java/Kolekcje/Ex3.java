package Kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        Double d1 = 1.53D;
        Double d2 = 0.98D;
        Double d3 = 1.33D;
        Double d4 = 2.11D;
        Double d5 = 0.87D;
        Double d6 = 0.22D;
        Double d7 = 3.14D;
        Double d8 = 2.42D;
        Double d9 = 0.65D;
        Double d10 = 0.11D;

        List<Double> dblList = new ArrayList<>();

        dblList.add(d1);
        dblList.add(d2);
        dblList.add(d3);
        dblList.add(d4);
        dblList.add(d5);
        dblList.add(d6);
        dblList.add(d7);
        dblList.add(d8);
        dblList.add(d9);
        dblList.add(d10);

        System.out.println("=================================================");
        System.out.println("Sum of first and last element of dbList ArrayList");
        System.out.println(dblList.get(0) + dblList.get(dblList.size() - 1));
        System.out.println("=================================================");
        System.out.println("Product of first and last element of dbList ArrayList");
        System.out.println(dblList.get(0) * dblList.get(dblList.size() - 1));
        System.out.println("=================================================");
        System.out.println("Quotient of first and last element of dbList ArrayList");
        System.out.println(dblList.get(1)/dblList.get(dblList.size() - 2));




    }
}
