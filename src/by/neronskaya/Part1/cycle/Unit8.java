package by.neronskaya.Part1.cycle;

import java.util.ArrayList;
import java.util.Scanner;

/*
Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Unit8 {
    public static void main(String[] args) {
        int a, b, num, temp;
        ArrayList<Boolean> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(false);
        }

        a = Utils.scanner("Введите первое натуральное число");
        b = Utils.scanner("Введите второе натуральное число");

        while (a > 0) {
            num = a % 10;
            a /= 10;
            temp = b;
            while (temp > 0) {
                if (temp % 10 == num) {
                    list.set(num, true);
                    break;
                }
                temp /= 10;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (list.get(i)) {
                System.out.print(i + " ");
            }

        }

    }

}

