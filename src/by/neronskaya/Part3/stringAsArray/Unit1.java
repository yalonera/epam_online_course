package by.neronskaya.Part3.stringAsArray;

/*
Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class Unit1 {
    public static void main(String[] args) {
        String[] camelCase = {"thisIsAnExample", "camelCase", "snakeCase",
                "cinnamonDonuts", "pizzaMargherita", "iWantToPassACourse"};
        String[] snakeCase = toSnakeCase(camelCase);

        System.out.println("Массив до изменений:\t" + String.join(", ", camelCase));
        System.out.println("Результат:\t " + String.join(", ", snakeCase));
    }

    private static String[] toSnakeCase(String[] camelCase) {
        String[] snakeCase = new String[camelCase.length];
        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder strBuilder = new StringBuilder();
            for (int j = 0; j < camelCase[i].length(); j++) {
                char letter = camelCase[i].toCharArray()[j];
                if (Character.isLowerCase(letter)) {
                    strBuilder.append(letter);
                } else {
                    strBuilder.append("_");
                    strBuilder.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = strBuilder.toString();
        }
        return snakeCase;
    }
}
