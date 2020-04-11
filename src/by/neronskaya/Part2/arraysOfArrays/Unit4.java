package by.neronskaya.Part2.arraysOfArrays;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
 */
public class Unit4 {
    public static void main(String[] args) {
        int a = Utils.scan("Введите количество строк и столбцов:");
        int index = 1;
        int num = a;
        int[][] array = new int[a][a];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = index;
                    index++;
                }
                index = 1;
            } else {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = num;
                    num--;
                }
                num = a;
            }
        }
        Utils.printMatrix(array);
    }
}
