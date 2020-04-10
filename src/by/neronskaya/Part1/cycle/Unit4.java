package by.neronskaya.Part1.cycle;

import java.math.BigDecimal;

/*
Составить программу нахождения cумму квадратов первых двухсот чисел.
 */
public class Unit4 {
    public static void main(String[] args) {
        double composition = 0;
        for (int i = 0; i <= 200; i++) {
            composition += Math.pow(i, 2);
        }
        System.out.println("Сумма квадратов первых 200 чисел: " + composition);
    }


}
