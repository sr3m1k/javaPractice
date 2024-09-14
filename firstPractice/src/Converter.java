import java.util.Scanner;

public class Converter {

    private static final double ROUBLES_PER_YUAN = 11.91;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter amount in yuan: ");
        int yuan = scanner.nextInt();

        double roubles = convertToRoubles(yuan);


        System.out.printf("Amount in Russian rubles: %.2f\n", roubles);
    }


    private static double convertToRoubles(int yuan) {
        return ROUBLES_PER_YUAN * yuan;
    }
}
