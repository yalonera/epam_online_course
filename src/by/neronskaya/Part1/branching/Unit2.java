package by.neronskaya.Part1.branching;

/*
Найти max{min(a, b), min(c, d)}
 */
public class Unit2 {
    public static void main(String[] args) {
        int a = Utils.scanner("Введите первое число");
        int b = Utils.scanner("Введите второе число");
        int c = Utils.scanner("Введите третье число");
        int d = Utils.scanner("Введите четвертое число");
        System.out.println(findMax(findMin(a, b), findMin(c, d)));
    }

    private static int findMin(int a, int b) {
        if (a < b) {
            return a;
        } else if (b < a) {
            return b;
        } else {
            return 0;
        }
    }

    private static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return 0;
        }
    }
}
