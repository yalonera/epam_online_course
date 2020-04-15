package by.neronskaya.Part2.decomposition;

import java.util.Random;

/*
Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
public class Unit16 {
    public static void main(String[] args) {
        int n = Utils.scan("ведите разрядность чисел");
        int[] arr = generateArray(n);
        Utils.printArray(arr, String.format("Массив %s-значных чисел", n));

        sumOdd(arr);
    }

    private static void sumOdd(int[] arr) {
        int sumOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isAllDigitsOdd(arr[i])) {
                sumOdd += arr[i];
            }
        }
        System.out.println("Сумма нечетных чисел равна " + sumOdd);
        int count = 0;
        int result;
        while (sumOdd != 0) {
            result = sumOdd % 10;
            if (result % 2 == 0) {
                count++;
            }
            sumOdd = sumOdd / 10;
        }
        System.out.println(" и содержит в себе  " + count + " четных цифр");
    }

    private static boolean isAllDigitsOdd(int a) {
        int d;
        while (a != 0) {
            d = a % 10;
            if (d % 2 != 0) {
                a = a / 10;
            } else {
                return false;
            }
        }
        return true;
    }

    private static int[] generateArray(int n) {

        int[] arr = new int[100];
        int min = (int) Math.pow(10, n - 1);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min + (int) (Math.random() * ((Math.pow(10, n)) - min));
        }
        return arr;
    }
}
