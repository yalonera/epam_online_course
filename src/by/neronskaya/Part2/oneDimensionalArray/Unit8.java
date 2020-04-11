package by.neronskaya.Part2.oneDimensionalArray;

/*
Дана последовательность целых чисел a1,a2, ... , an . Образовать новую последовательность, выбросив из
исходной те члены, которые равны min( a1, a2, ... , an ) .
 */
public class Unit8 {
    public static void main(String[] args) {
        int size = Utils.scanner("Введите размер массива");
        int[] array = Utils.fillArrayWithRandom(size);
        Utils.printArray(array);
        System.out.println("Результат ");
        Utils.printArray(removeMin(array));
    }

    private static int[] removeMin(int[] array) {
        int counter = 0;
        int min = array[0];
        //поиск минимального элемента
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }

        //счетчик минимальных элементов
        for (int element : array) {
            if (element == min) {
                counter++;
            }
        }
        //создание нового массива
        int[]resultArray = new int[array.length-counter];
        //заполнение resultArray
        int j=0;
        for (int i =0;i<array.length;i++){
            if (array[i]!=min){
                resultArray[j++]=array[i];
            }
        }
        return resultArray;
    }

}
