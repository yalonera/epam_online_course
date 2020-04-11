package by.neronskaya.Part2.arraysOfArrays;

/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Unit2 {
    public static void main(String[] args) {
        int a = Utils.scan("Введите количество строк:");
        int b = Utils.scan("Введите количество столбцов:");
        int[][] arr = Utils.fillMatrixWithRandomInt(a, b);
        Utils.printMatrix(arr);
        System.out.println("Результат:");
        findDiagonal(arr);
    }

    private static void findDiagonal(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

}
