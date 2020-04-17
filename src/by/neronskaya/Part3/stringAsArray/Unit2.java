package by.neronskaya.Part3.stringAsArray;

/*
Замените в строке все вхождения 'word' на 'letter'.
 */
public class Unit2 {
    public static void main(String[] args) {
        String initial = "The task of defining what constitutes a \"word\" involves determining where one " +
                "word ends and another word begins—in other words, identifying word boundaries.";
        System.out.println("Строка до изменений: " + initial);
        System.out.println("Строка после изменений: " + changeWords(initial));

    }

    private static String changeWords(String first) {
        StringBuilder stringBuilder = new StringBuilder();
        String newStr;
        char[] strToChar = first.toCharArray();
        for (int i = 0; i < strToChar.length; i++) {
            if (i + 3 < first.length() &&
                    first.charAt(i) == 'w' &&
                    first.charAt(i + 1) == 'o' &&
                    first.charAt(i + 2) == 'r' &&
                    first.charAt(i + 3) == 'd') {
                stringBuilder.append("letter");
                i = i + 3;
            } else {
                stringBuilder.append(first.charAt(i));
            }
        }
        newStr = stringBuilder.toString();
        return newStr;
    }
}
