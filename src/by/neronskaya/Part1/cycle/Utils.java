package by.neronskaya.Part1.cycle;

import java.util.Scanner;

public class Utils {
    public static int scanner(String message) {
        System.out.println(message);
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
        }
        return scan.nextInt();
    }
}
