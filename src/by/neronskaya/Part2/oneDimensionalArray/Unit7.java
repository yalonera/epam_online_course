package by.neronskaya.Part2.oneDimensionalArray;

/*
Даны действительные числа n a1 ,a2 ,... ,an .
Найти max(A1+A2n,A2+A2n-1,...An+An+1)
 */
public class Unit7 {
    public static void main(String[] args) {
        int size = Utils.scanner("Введите размер массива");
        int[] array = Utils.fillArrayWithRandom(size);
        Utils.printArray(array);
        System.out.println(findMax(array));

    }

    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            max = Integer.max(max, array[i] + array[j]);
        }
        return max;
    }
}
