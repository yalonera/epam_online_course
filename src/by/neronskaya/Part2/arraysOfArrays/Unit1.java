package by.neronskaya.Part2.arraysOfArrays;

/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class Unit1 {
    public static void main(String[] args) {
        int a = Utils.scan("Введите количество строк:");
        int b = Utils.scan("Введите количество столбцов:");
        int[][] arr = Utils.fillMatrixWithRandomInt(a, b);
        Utils.printMatrix(arr);
        System.out.println("Результат:");
        findOddColumns(arr);


    }

    private static void findOddColumns(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j += 2) {
                if (arr[0][j] > arr[arr.length - 1][j]) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
            System.out.println();
        }

    }
}
