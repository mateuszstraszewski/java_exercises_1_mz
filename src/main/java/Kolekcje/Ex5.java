package Kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        List<String> namesScan = new ArrayList<>();
        System.out.println(namesScan.size());
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Please provide " + (i + 1) + " name.");
            String tempName = scan.nextLine();
            namesScan.add(i, tempName);
        }

        int i = 0;
        while(i < namesScan.size()) {
            System.out.println(namesScan.get(i));
            i++;
        }
    }
}
