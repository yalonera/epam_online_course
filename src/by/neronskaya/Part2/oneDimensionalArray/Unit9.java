package by.neronskaya.Part2.oneDimensionalArray;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.
 */
public class Unit9 {
    public static void main(String[] args) {
        int size = Utils.scanner("Введите размер массива");
        int[] array = Utils.fillArrayWithRandom(size);
        Utils.printArray(array);
        findFrequencyNumber(array);
    }

    private static void findFrequencyNumber(int[] array) {
        int[] freqArr = new int[array.length];
        int freqCounter = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == number) {
                    counter++;
                }
            }
            freqArr[i] = counter;
            if (counter > freqCounter) {
                freqCounter = counter;
            }
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < freqArr.length; i++) {
            if (freqArr[i] == freqCounter && array[i] < result) {
                result = array[i];
            }
        }
        System.out.println(result);
    }


}
