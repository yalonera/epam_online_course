package by.neronskaya.Part2.oneDimensionalArray;

/*
Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */
public class Unit3 {
    public static void main(String[] args) {
        int n = Utils.scanner("Введите размер массива");
        int[] array = Utils.fillArrayWithRandom(n);
        Utils.printArray(array);
        countElements(array);
    }

    private static void countElements(int[] array) {
        int counterPositive = 0;
        int counterNegative = 0;
        int counterNull = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counterPositive++;
            } else if (array[i] < 0) {
                counterNegative++;
            } else {
                counterNull++;
            }
        }
        System.out.println("В массиве " + counterNegative + " отрицательных элементов "
                + counterPositive + " положительных элементов "
                + counterNull + " нулевых элементов.");
    }
}
