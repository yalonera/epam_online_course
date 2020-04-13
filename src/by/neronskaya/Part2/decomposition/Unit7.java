package by.neronskaya.Part2.decomposition;

/*
Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Unit7 {
    public static void main(String[] args) {
        System.out.println("Результат: ");
        System.out.println(findSumFactorial());

    }

    private static int findSumFactorial() {
        int sum = 0;
        int result = 1;

        for (int i = 1; i <= 9; i++) {
            result = result * i;
            if (i % 2 != 0) {
                sum += result;
            }
        }
        return sum;
    }
}
