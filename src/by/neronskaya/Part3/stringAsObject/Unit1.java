package by.neronskaya.Part3.stringAsObject;

/*
Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class Unit1 {
    public static void main(String[] args) {
        String text = "È tenersi per mano           andare lontano, la felicità" +
                "E il tuo sguardo     innocente in mezzo alla   gente, la felicità" +
                "È restare   vicini come  bambini, la felicità" +
                "Felicità";
        System.out.println("Результат: " + findLargestNumberOfConsecutiveSpaces(text));

    }

    private static int findLargestNumberOfConsecutiveSpaces(String str) {
        int sumMaxSpaces = 0;
        for (int i = 0; i < str.length(); i++) {
            int sumSpaces = 0;
            while (str.charAt(i) == ' ') {
                sumSpaces++;
                i++;
            }
            if (sumSpaces > sumMaxSpaces) {
                sumMaxSpaces = sumSpaces;
            }
        }
        return sumMaxSpaces;
    }
}
