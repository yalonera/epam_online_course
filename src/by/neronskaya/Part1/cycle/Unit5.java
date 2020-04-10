package by.neronskaya.Part1.cycle;

/*
Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е.
 */
public class Unit5 {
    public static void main(String[] args) {
        int n = 10;
        double e = Utils.scanner("Введите число для сравнения");
        double sum = 0.0;
        double a = 0.0;
        for (int i = 0; i <= n; i++) {
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }
        System.out.println(a);
        System.out.println("Сумма равна " + sum);


    }
}
