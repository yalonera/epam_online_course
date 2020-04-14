package by.neronskaya.Part2.decomposition;

/*
Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.
 */
public class Unit8 {
    public static void main(String[] args) {
        int size = Utils.scan("Введте размер массива");
        int[] array = Utils.fillArrayWithRandom(size);
        Utils.printArray(array, "Массив: ");
        findSums(array);


    }

    private static void findSums(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        System.out.println("Полученные суммы: ");

        for (int i = 1; i <= 3; i++) {
            sum1 += arr[i];
        }
        System.out.println("S1: " + sum1);

        for (int i = 3; i <= 5; i++) {
            sum2 += arr[i];
        }
        System.out.println("S2: " + sum2);

        for (int i = 4; i <= 6; i++) {
            sum3 += arr[i];
        }
        System.out.println("S3: " + sum3);

    }
}
