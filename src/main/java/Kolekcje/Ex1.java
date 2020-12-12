package Kolekcje;

public class Ex1 {
    public static void main(String[] args) {
        int[] intArray = new int[10];

        for (int i = 0; i < 10; i++) {
            intArray[i] = i + 1;
        }

        System.out.println("Array length is: " + intArray.length);

        System.out.println("=========================================");

        for (int a : intArray) {
            System.out.println(a);
        }

        System.out.println("=========================================");

        int[] intArrayMult = new int[intArray.length];

        for (int i = 0; i < 10; i++) {
            intArrayMult[i] = intArray[i] * 2;
        }

        System.out.println("=========================================");

        for (int a : intArrayMult) {
            System.out.println(a);
        }

    }
}
