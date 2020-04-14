package by.neronskaya.Part2.decomposition;

/*
Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N.
 */
public class Unit12 {
    public static void main(String[] args) {
        int sizeArr = Utils.scan("Введите размер массива");
        int k = Utils.scan("Введите сумму цифр");
        int n = Utils.scan("Введите максимально возможное значение");
        Utils.printArray(fillArr(k, n, sizeArr), "Результат: ");
    }

    private static int[] fillArr(int k, int n, int size) {
        int count = 0;
        int[] a = new int[size];
        while (count != size) {
            int temp = getRandomNumber(n);
            if (sumNumeral(temp) == k) {
                a[count] = temp;
                count++;
            }
        }
        return a;
    }

    private static int sumNumeral(int x) {
        int sum = 0;
        while (x != 0) {
            sum = sum + x % 10;
            x = x / 10;
        }
        return sum;
    }

    private static int getRandomNumber(int n) {
        int number = (int) (Math.random() * (n + 1));
        return number;
    }
}
