package by.neronskaya.Part1.cycle;

/*
Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера (Таблицу ASCII)
 */
public class Unit6 {
    public static void main(String[] args) {
        for (int i = 32; i <= 126; i++) {
            System.out.print(i + "  " + (char) i);
        }
        System.out.println();
    }
}
