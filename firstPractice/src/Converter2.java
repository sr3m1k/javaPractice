import java.util.Scanner;

public class Converter2 {

    private static final double ROUBLES_PER_YUAN = 11.91;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в юанях: ");
        int yuan = scanner.nextInt();


        double roubles = convertToRoubles(yuan);

        // Вывод результата с правильным окончанием
        String yuanWithEnding = getYuanWithEnding(yuan);
        System.out.printf("Сумма в %s: %.2f рублей\n", yuanWithEnding, roubles);
    }


    private static double convertToRoubles(int yuan) {
        return ROUBLES_PER_YUAN * yuan;
    }


    private static String getYuanWithEnding(int yuan) {
        int lastDigit = yuan % 10;
        int lastTwoDigits = yuan % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 19) {
            return yuan + " китайских юаней";
        }

        return switch (lastDigit) {
            case 1 -> yuan + "китайский юань";
            case 2, 3, 4 -> yuan + " китайских юанях";
            default -> yuan + " китайских юаня";
        };
    }
}
