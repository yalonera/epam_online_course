package by.neronskaya.Part2.decomposition;

/*
Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class Unit6 {
    public static void main(String[] args) {
        int firstNum = Utils.scan("Введите первое число: ");
        int secNum = Utils.scan("Введите второе число: ");
        int thirdNum = Utils.scan("Введите третье число: ");
        System.out.println(cheakThreeNum(firstNum, secNum, thirdNum));

    }

    private static int nod(int a, int b) {
        if (b > a) {
            return nod(b, a);
        }
        if (b == 0) {
            return a;
        }
        return nod(b, a % b);
    }

    private static boolean cheakThreeNum(int a, int b, int c) {
        if (nod(nod(a, b), c) == 1) {
            return true;
        } else {
            return false;
        }

    }
}
