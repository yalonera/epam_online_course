package by.neronskaya.Part2.oneDimensionalArray;

import java.util.Arrays;

/*
Дан целочисленный массив с количеством элементов п.
Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
Примечание. Дополнительный массив не использовать.
 */
public class Unit10 {
    public static void main(String[] args) {
        int size = Utils.scanner("Введите размер массива");
        int[] array = Utils.fillArrayWithRandom(size);
        Utils.printArray(array);
        System.out.println("Результат:");
        Utils.printArray(compressArray(array));
    }

    private static int[] compressArray(int[] array) {
        int indexEl = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            array[indexEl] = array[i];
            indexEl++;
        }
        Arrays.fill(array, indexEl, array.length, 0);
        return array;
    }

}
