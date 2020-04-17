package by.neronskaya.Part3.stringAsObject;

import java.util.Objects;

/*
Проверить, является ли заданное слово палиндромом.
 */
public class Unit3 {
    public static void main(String[] args) {
        String text = "Анна";
        System.out.println(isPalindrome(text));

    }

    private static boolean isPalindrome(String string) {
        /*
        перебираем заданную строку String из последнего символа и добавляем каждый символ
        к следующему символу, вплоть до первого символа, тем самым обращая заданную строку String.
         */
        StringBuilder reverse = new StringBuilder();
        String clean = string.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);
    }
}
