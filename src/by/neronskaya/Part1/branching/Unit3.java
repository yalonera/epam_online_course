package by.neronskaya.Part1.branching;

/*
Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой
 */
public class Unit3 {
    public static void main(String[] args) {
        int x1 = Utils.scanner("Введите координаты первой точки");
        int y1 = Utils.scanner("Введите координаты первой точки");
        int x2 = Utils.scanner("Введите координаты второй точки");
        int y2 = Utils.scanner("Введите координаты второй точки");
        int x3 = Utils.scanner("Введите координаты третьей точки");
        int y3 = Utils.scanner("Введите координаты третьей точки");

        if ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0) {
            System.out.println("Точки лежат на одной прямой!");
        }else {
            System.out.println("Тояки не лежат на одной прямой");
        }
    }
}
