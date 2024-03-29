package by.neronskaya.Part2.sorting;

/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
 */

/**
 * System.arrayCopy(from, fromIndex, to, toIndex, count);
 * from - массив, который копируем
 * to - массив в которой копируем
 * fromIndex - индекс в массиве from начиная с которого берем элементы для копирования
 * toIndex - индекс в массиве to начиная с которого вставляем элементы
 * count - количество элементов которые берем из массива from и вставляем в массив to
 * Массив to должен иметь достаточный размер, чтобы в нем уместились все копируемые элементы.
 */
public class Unit1 {
    public static void main(String[] args) {
        int sizeFirstArr = Utils.scanner("Введите размер первого массива");
        int sizeSecArr = Utils.scanner("Введите размер второго массива");
        int[] firstArr = Utils.fillArrayWithRandom(sizeFirstArr);
        int[] secArr = Utils.fillArrayWithRandom(sizeSecArr);
        int k = Utils.scanner("Введите индекс для вставки массива");
        int[] newArr = new int[sizeFirstArr + sizeSecArr];

        System.arraycopy(firstArr, 0, newArr, 0, k);
        System.arraycopy(secArr, 0, newArr, k, sizeSecArr);
        System.arraycopy(firstArr, sizeFirstArr - 1 - k, newArr, sizeSecArr + k, sizeFirstArr - k);

        System.out.println("Первый массив:");
        Utils.printArray(firstArr);
        System.out.println("Второй массив:");
        Utils.printArray(secArr);
        Utils.printArray(newArr);


    }
}
