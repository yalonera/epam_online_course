package by.neronskaya.Part2.sorting;

/*
Сортировка Шелла. Дан массив n действительных чисел.
Требуется упорядочить его по возрастанию. Составить алгоритм этой сортировки.
 */
public class Unit6 {
    public static void main(String[] args) {
        int size = Utils.scanner("Введите размер массива");
        int[] arr = Utils.fillArrayWithRandom(size);
        Utils.printArray(arr);
        System.out.println("Результат: ");
        Utils.printArray(shellSort(arr));


    }

    private static int[] shellSort(int[] array) {
        int temp, j;
        for (int i = array.length / 2; i > 0; i /= 2) {
            for (int k = i; k < array.length; k++) {
                temp = array[k];
                j = k;
                while ((j >= i) && (array[j - i]) > temp) {
                    array[j] = array[j - i];
                    j -= i;
                }
                array[j] = temp;
            }
        }
        return array;

    }
}
