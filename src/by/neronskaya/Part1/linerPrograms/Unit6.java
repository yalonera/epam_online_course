package by.neronskaya.Part1.linerPrograms;

/*
Для данной области составить линейную программу, которая печатает true,
если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае.
 */
public class Unit6 {
    public static void main(String[] args) {
        int x = Utils.scanner("Введите координату x");
        int y = Utils.scanner("Введите координату y");
        System.out.println(findFigure(x,y));


    }
    private static boolean findFigure(int x,int y){
        if ((x >= 2 | x <= -2) & (y >= 4 | y <= 0)) {
            if ((x <= -4 | x >= 4) & y <= -3){
                return true;
            }
        }else {
            return false;
        }
        return false;
    }


}
