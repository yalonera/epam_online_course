package by.neronskaya.Part3.stringAsObject;

/*
В строке вставить после каждого символа 'a' символ 'b'.
 */
public class Unit2 {
    public static void main(String[] args) {
        String text = "Find light in the beautiful sea, I choose to be happy" +
                "You and I, you and I, we're like diamonds in the sky" +
                "You're a shooting star I see, a vision of ecstasy" +
                "When you hold me, I'm alive" +
                "We're like diamonds in the sky";
        System.out.println(characterReplacement(text));
    }

    private static String characterReplacement(String string) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                strBuilder.append("ab");
            } else {
                strBuilder.append(string.charAt(i));
            }
        }
        return strBuilder.toString();
    }

}
