package by.neronskaya.Part2.decomposition;

import static java.lang.String.valueOf;

/*
Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class Unit11 {
    public static void main(String[] args) {
        int firstNum = Utils.scan("Введите первое число");
        int secNum = Utils.scan("Введите второе число");
        compareLengthNum(firstNum, secNum);

    }

    private static void compareLengthNum(int a, int b) {
        if (findLengthNumber(a) > findLengthNumber(b)) {
            System.out.println("В первом числе больше цифр");
        } else if (findLengthNumber(a) < findLengthNumber(b)) {
            System.out.println("Во втором числе больше цифр ");
        } else {
            System.out.println("Количество цифр первого числа равно количеству второго");
        }
    }

    private static int findLengthNumber(int num) {
        int len = valueOf(num).toCharArray().length;
        return len;
    }
}
