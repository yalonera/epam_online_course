package by.neronskaya.Part2.arraysOfArrays;

/*
Сформировать квадратную матрицу порядка N по правилу: A[I,J] = sin((I^2 -J^2)/N)
и подсчитать количество положительных элементов в ней.
 */
public class Unit7 {
    public static void main(String[] args) {
        int a = Utils.scan("Введите количество строк и столбцов:");
        double[][] arr = new double[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / a);
            }
        }
        Utils.printMatrix(arr);

    }
}
