package by.neronskaya.Part2.oneDimensionalArray;

/*
Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class Unit5 {
    public static void main(String[] args) {
        int size = Utils.scanner("Введите размер массива");
        int[] array = Utils.fillArrayWithRandom(size);
        Utils.printArray(array);
        findElements(array);

    }

    private static void findElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.println("array[" + i + "] = " + array[i]);
            }
        }
    }
}
