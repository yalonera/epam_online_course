package by.neronskaya.Part2.oneDimensionalArray;

import java.util.Arrays;

/*
Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */
public class Unit4 {
    public static void main(String[] args) {
        int size = Utils.scanner("Введите размер массива");
        int[] array = Utils.fillArrayWithRandom(size);
        Utils.printArray(array);
        System.out.println(replacementOfPositions(array));
    }

    private static String replacementOfPositions(int[] array) {
        int temp;
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
            if (array[i] > array[max]) {
                max = i;
            }
        }
        temp = array[min];
        array[min] = array[max];
        array[max] = temp;
        return Arrays.toString(array);

    }
}
