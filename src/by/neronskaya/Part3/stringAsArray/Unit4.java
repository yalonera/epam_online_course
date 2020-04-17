package by.neronskaya.Part3.stringAsArray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
В строке найти количество чисел.
 */
public class Unit4 {
    public static void main(String[] args) {
        String str = "обычно размер строки хранится в 32-битовом поле, что даёт максимальный размер строки в 4294967295 байт (4 гигабайта)";
        System.out.println("Строка: \t " + str);
        findQuantityNum(str);
    }

    private static void findQuantityNum(String str) {
        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("В строке " + count + " чисел");

    }
}
