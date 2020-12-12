package Kolekcje;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        PriorityQueue numQueue = new PriorityQueue<>();

        Scanner scan = new Scanner(System.in);
        int numCount = scan.nextInt();
        Random newRand = new Random();
        int upperbound = 101;

        for (int i = 0; i < numCount - 1; i++) {
            int tempNum = newRand.nextInt(upperbound);
            numQueue.add(tempNum);
        }

        for (int i = 0; i < numQueue.size(); i++) {
            System.out.println(numQueue.poll());
        }
    }
}
