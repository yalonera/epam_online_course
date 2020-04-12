package by.neronskaya.Part2.sorting;

/*
Даны две последовательности. Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание.
Дополнительный массив не использовать.
 */

/**
 * System.arrayCopy(from, fromIndex, to, toIndex, count);
 * from - массив, который копируем
 * to - массив в которой копируем
 * fromIndex - индекс в массиве from начиная с которого берем элементы для копирования
 * toIndex - индекс в массиве to начиная с которого вставляем элементы
 * count - количество элементов которые берем из массива from и вставляем в массив to
 */
public class Unit2 {
    public static void main(String[] args) {
        int sizeFirstArr = Utils.scanner("Введите размер первого массива");
        int sizeSecArr = Utils.scanner("Введите размер второго массива");
        int[] firstArr = Utils.fillArrayWithRandom(sizeFirstArr);
        int[] secArr = Utils.fillArrayWithRandom(sizeSecArr);
        int[] newArr = new int[sizeFirstArr + sizeSecArr];
        System.arraycopy(firstArr, 0, newArr, 0, sizeFirstArr);
        System.arraycopy(secArr, 0, newArr, sizeFirstArr, sizeSecArr);

        System.out.print("Первый ");
        Utils.printArray(firstArr);
        System.out.print("Второй ");
        Utils.printArray(secArr);
        System.out.println("Результат:");
        Utils.printArray(bubbleSort(newArr));


    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int buffer = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buffer;
                }
            }
        }
        return arr;
    }


}
