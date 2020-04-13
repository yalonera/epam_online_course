package by.neronskaya.Part2.decomposition;

/*
Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Unit2 {
    public static void main(String[] args) {
        int a = Utils.scan("Введите первое число");
        int b = Utils.scan("Введите второе число");
        int c = Utils.scan("Введите третье число");
        int d = Utils.scan("Введите четвертое число");
        System.out.println(findNOD(findNOD(a,b),findNOD(c,d)));

    }
    private static int findNOD(int a, int b) {
        //НОД - исло, которое делит без остатка два числа
        // и делится само без остатка на любой другой делитель данных двух чисел.
        int nod = 1;
        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
                break;
            }
        }
        return nod;
    }
}
