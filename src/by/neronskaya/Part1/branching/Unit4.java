package by.neronskaya.Part1.branching;

/*
Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
 */
public class Unit4 {
    public static void main(String[] args) {
        int a = Utils.scanner("Введите размер отверстия: ");
        int b = Utils.scanner("Введите размер отверстия: ");

        int x = Utils.scanner("адайте размер кирпича");
        int y = Utils.scanner("адайте размер кирпича");
        int z = Utils.scanner("адайте размер кирпича");
        if ((a > x) && (b > y)) {
            System.out.println("Пройдет");
        } else if ((a > y) && (b > x)) {
            System.out.println("Пройдет");
        } else if ((a > x) && (b > x)) {
            System.out.println("Пройдет");
        } else if ((a > z) && (b > z)) {
            System.out.println("Пройдет");
        } else if ((a > y) && (b > z)) {
            System.out.println("Пройдет");
        } else if ((a > z) && (b > y)){
            System.out.println("Пройдет");
        }else {
            System.out.println("Не пройдет");
        }
    }

}
