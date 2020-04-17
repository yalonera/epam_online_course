package by.neronskaya.Part3.stringAsArray;

/*
Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */
public class Unit5 {
    public static void main(String[] args) {
        String text = "Con  te partirò; " +
                "Paesi che non   ho mai; " +
                "Veduto   e vissuto con te; " +
                "Adesso si li vivrò; " +
                "Con te partirò; " +
                "Su    navi per mari; " +
                "Che io lo so; " +
                "No no    non esistono più; " +
                "Con te io li vivrò. " +
                "Andrea Bocelli     ♥";
        System.out.println(removeExtraSpaces(text));

    }

    private static String removeExtraSpaces(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String str = string.trim();
        boolean isSpace = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (!isSpace) {
                    stringBuilder.append(" ");
                }
                isSpace = true;
            } else {
                stringBuilder.append(str.charAt(i));
                isSpace = false;
            }
        }
        return stringBuilder.toString();
    }
}
