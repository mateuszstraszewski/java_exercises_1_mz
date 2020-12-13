package Kolekcje;

import java.util.Iterator;
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

        for (int i = 0; i < numCount; i++) {
            int tempNum = newRand.nextInt(upperbound);
            numQueue.add(tempNum);
        }

        System.out.println("=======================================================");

        for (int i = 0; i < numQueue.size(); i++) {
            System.out.println(numQueue.poll());
        }

        System.out.println("=======================================================");
//
//        Iterator it = numQueue.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next() + " ");
//        }

    }
}
