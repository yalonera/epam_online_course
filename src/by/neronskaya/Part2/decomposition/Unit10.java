package by.neronskaya.Part2.decomposition;

/*
Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N.
 */
public class Unit10 {
    public static void main(String[] args) {
        int n = Utils.scan("Введите натуральное число");
        Utils.printArray(createArr(n),"Результат: ");

    }

    private static int[] createArr(int n) {
        int temp = n;
        int count = 0;
        while (temp != 0) { //определение размера массива
            count++;
            temp /= 10;
        }
        int[] array = new int[count];
        int j = count - 1;
        while (n != 0) {
            array[j--] = n % 10;
            n /= 10;
        }
        return array;
    }
}
