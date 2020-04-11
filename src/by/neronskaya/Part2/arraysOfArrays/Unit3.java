package by.neronskaya.Part2.arraysOfArrays;

/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class Unit3 {
    public static void main(String[] args) {
        int a = Utils.scan("Введите количество строк:");
        int b = Utils.scan("Введите количество столбцов:");
        int k = Utils.scan("Введите номер строки:");
        int p = Utils.scan("Введите номер столбца:");
        int[][] arr = Utils.fillMatrixWithRandomInt(a, b);
        Utils.printMatrix(arr);
        System.out.println("Результат:");
        printElemArr(arr, k, p);

    }

    private static void printElemArr(int[][] arr, int k, int p) {
        System.out.println("Заданная строка");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[k][j] + " ");
        }
        System.out.println();

        System.out.println("Заданный столбец");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][p] + " ");
        }
        System.out.print(" ");
    }
}
