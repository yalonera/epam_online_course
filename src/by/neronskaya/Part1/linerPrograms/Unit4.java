package by.neronskaya.Part1.linerPrograms;

/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */
public class Unit4 {
    public static void main(String[] args) {
        double x = Utils.doubleScanner("Введите дробное число вида nnn.ddd ");
        System.out.println("Результат: " + createNewNumber(x));

    }

    private static double createNewNumber(double x) {
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        return y;
    }
}
