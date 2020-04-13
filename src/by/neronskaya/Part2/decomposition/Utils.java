package by.neronskaya.Part2.decomposition;

import java.util.Scanner;

public class Utils {
    public static int scan(String message) {
        System.out.println(message);
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
        }
        return scan.nextInt();
    }
    public static int[] fillArrayWithRandom(int a) {
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        return array;
    }
    public static void printArray(int[] array, String message) {
        System.out.println(message);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
}
