package by.neronskaya.Part2.decomposition;

/*
Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
public class Unit17 {
    public static void main(String[] args) {
        int n = Utils.scan("Введите число");
        System.out.println("Результат: " + countQuantityOfSums(n));
    }

    private static int countQuantityOfSums(int n) {
        int count = 0;
        while (n > 0) {
            n = n - getSum(n);
            count++;
        }
        return count;
    }

    private static int getSum(int n) {
        int sum = 0;
        int res = 0;
        while (n != 0) {
            res = n % 10;
            sum += res;
            n /= 10;
        }

        return sum;
    }


}
