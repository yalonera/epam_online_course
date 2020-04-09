package by.neronskaya.Part2.arraysOfArrays;

/*
Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
public class Unit13 {
    public static void main(String[] args) {
        int[][] arr = Utils.fillMatrixWithRandomInt(4, 4);
        Utils.printMatrix(arr);
        System.out.println("Отсортированный по возрастанию значений в столбцах");
        Utils.printMatrix(sortRowsAscending(arr));
        System.out.println("Отсортированный по убыванию значений в столбцах");
        Utils.printMatrix(sortRowsDescending(arr));
    }

    private static int[][] sortRowsAscending(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                for (int k = 0; k < arr[i].length - i - 1; k++) {
                    if (arr[k][j] > arr[k + 1][j]) {
                        int t = arr[k][j];
                        arr[k][j] = arr[k + 1][j];
                        arr[k + 1][j] = t;
                    }
                }
            }
        }
        return arr;
    }

    private static int[][] sortRowsDescending(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                for (int k = 0; k < arr[i].length - i - 1; k++) {
                    if (arr[k][j] < arr[k + 1][j]) {
                        int t = arr[k][j];
                        arr[k][j] = arr[k + 1][j];
                        arr[k + 1][j] = t;
                    }
                }
            }
        }
        return arr;
    }
}