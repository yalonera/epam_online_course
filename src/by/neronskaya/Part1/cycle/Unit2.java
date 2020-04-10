package by.neronskaya.Part1.cycle;

/*
Вычислить значения функции на отрезке [а,b] c шагом h
 */
public class Unit2 {
    public static void main(String[] args) {
        int x;
        int a = Utils.scanner("Введите начало диапазона");
        int b = Utils.scanner("Введите конец диапазона");
        int h = Utils.scanner("Введите шаг");
        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                x = i;
            } else {
                x = i * (-1);
            }System.out.println("Результат: " + x);
        }


    }


}
