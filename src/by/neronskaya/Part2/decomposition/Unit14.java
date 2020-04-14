package by.neronskaya.Part2.decomposition;

/*
Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.
 */
public class Unit14 {
    public static void main(String[] args) {
        int k = Utils.scan("Введите диапазон");
        System.out.println("Числа Армстронга: ");
        findArmstrong(k);

    }

    private static void findArmstrong(int k) {
        for (int i = 1; i <= k; ++i) {
            // подсчет количества цифр
            int x = i;
            int n = 0;
            while (x != 0) {
                x /= 10;
                ++n;
            }
            // вычисление суммы n-й степени цифр числа
            int pow_sum = 0;
            x = i;
            while (x != 0) {
                int digit = x % 10;
                pow_sum += Math.pow(digit, n);
                x /= 10;
            }
            // проверяет, равно ли число i сумме n-й степени его цифр
            if (pow_sum == i)
                System.out.print(i + " ");
        }
    }
}
