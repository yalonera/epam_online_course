package by.neronskaya.Part2.decomposition;

/*
Даны числа X, Y, Z, Т — длины сторон четырехугольника.
Написать метод(методы) вычисления его площади,если угол между сторонами длиной X и Y— прямой.
 */
public class Unit9 {
    public static void main(String[] args) {
        int x = Utils.scan("Введите длинну четырехугольника");
        int y = Utils.scan("Введите длинну четырехугольника");
        int z = Utils.scan("Введите длинну четырехугольника");
        int t = Utils.scan("Введите длинну четырехугольника");
        System.out.println("Площадь четырехугольника: " + findQuadrangleArea(x, y, z, t));

    }

    private static double findQuadrangleArea(int x, int y, int z, int t) {
        double diagonal = Math.sqrt(x * x + y * y);
        //Диагональ напротив прямого угла, находим по теореме Пифагора
        double firstPartOfArea = x * y * 0.5;
        //Первая часть площади четырехугольника
        double secondPartOfArea = 0.25 * Math.sqrt((diagonal + z + t) * (diagonal + z - t) * (diagonal + t - z) * (z + t - diagonal));
        //Вторая часть площади четырехугольника
        double area = firstPartOfArea + secondPartOfArea;
        return area;

    }
}
