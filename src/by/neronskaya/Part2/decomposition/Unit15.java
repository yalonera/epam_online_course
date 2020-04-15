package by.neronskaya.Part2.decomposition;

import java.io.Console;

/*
Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */
public class Unit15 {
    public static void main(String[] args) {
        int n = Utils.scan("Введите разря чисел");
       findIncreasingSequenceOfDigits(n);
    }

    private static void findIncreasingSequenceOfDigits(int n) {
        int a = 0, b = 0, k = 1;
        for (int i = 0; i < n; i++) {
            a += (n - i) * k;
            b += (9 - i) * k;
            k *= 10;
        }
        for (int i = a; i <= b; i++) {
            k = i;
            int d = k % 10, j;
            for (j = 1; j < n; j++) {
                k /= 10;
                if (k % 10 >= d) {
                    break;
                }
                d = k % 10;
            }
            if (j == n) {
                System.out.println(i);
            }
        }
    }
}
