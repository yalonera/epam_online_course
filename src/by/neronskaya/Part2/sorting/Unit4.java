package by.neronskaya.Part2.sorting;

import java.util.Arrays;

/*
Сортировка обменами. Дана последовательность чисел.Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа .
Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class Unit4 {
    public static void main(String[] args) {
        int size = Utils.scanner("Введите размер массива");
        int[] array = Utils.fillArrayWithRandom(size);
        Utils.printArray(array);
        sort(array);


    }

    private static void sort(int[] arr) {
        int count = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int buffer = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buffer;
                    count++;
                }
            }

        }
        System.out.println("Результат: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Количество перестановок: " + count);


    }
}
