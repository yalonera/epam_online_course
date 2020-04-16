package by.neronskaya.Part2.sorting;

/*
Пусть даны две неубывающие последовательности действительных чисел .
Требуется указать те места, на которые нужно вставлять элементы второй последовательности  в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
public class Unit7 {
    public static void main(String[] args) {
        int[] arrayA = {2, 5, 12, 42, 43, 51, 56, 68, 68, 69, 81, 101, 152};
        int[] arrayB = {1, 15, 22, 31, 42};
        int[] newArray = arrayA;

        System.out.println("Даны последовательность A:");
        printArray(arrayA);
        System.out.println("\nи последовательность B:");
        printArray(arrayB);

        for (int element : arrayB) {
            int pointInsert = nextInsert(newArray, element);
            int[] arrayTemp = new int[newArray.length + 1];
            for (int i = 0; i < newArray.length; i++) {
                if (pointInsert > i) {
                    arrayTemp[i] = newArray[i];
                } else if (pointInsert == i) {
                    arrayTemp[i] = element;
                    arrayTemp[i + 1] = newArray[i];
                } else {
                    arrayTemp[i + 1] = newArray[i];
                }
            }
            newArray = arrayTemp;
            System.out.printf("%n%nПозиция вставки нового элемента \"%d\": i = %d", element, pointInsert);
            System.out.println("\nНовая последовательность:");
            printArray(newArray);
        }
    }

    private static int nextInsert(int[] array, int element) {
        int j = 0;
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (array[j] == element) {
                return j;
            } else if (array[j] < element) {
                firstIndex = j + 1;
            } else if (array[j] > element && j != 0 && !(array[j - 1] < element)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }

    private static void printArray(int[] a) {
        for (int element : a) {
            System.out.printf("%d ", element);
        }
    }
}
