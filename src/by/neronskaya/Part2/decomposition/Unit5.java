package by.neronskaya.Part2.decomposition;

/*
Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class Unit5 {
    public static void main(String[] args) {
        int size = Utils.scan("Введите размер массива");
        int[] arr = Utils.fillArrayWithRandom(size);
        Utils.printArray(arr, "Массив одномерный: ");
        System.out.println("Второе по величине число массива: " + findSecondMax(arr));

    }

    private static int findSecondMax(int[] arr) {
        int max = arr[0];
        int secMax = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            }
        }
        return secMax;
    }
}
