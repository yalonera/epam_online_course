package by.neronskaya.Part1.cycle;

/*
Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */
public class Unit7 {
    public static void main(String[] args) {
        int m = Utils.scanner("Введите начало промежутка");
        int n = Utils.scanner("Введите конец промежутка");

        while (m <= n) {
            System.out.print(m + ": ");
            for (int i = 2; i < m - 1; i++) {
                if (m % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            m++;
        }

    }
}
