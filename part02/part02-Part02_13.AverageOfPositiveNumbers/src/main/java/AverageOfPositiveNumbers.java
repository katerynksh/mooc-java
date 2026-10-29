
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int amount = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            if (number > 0) {
                amount = amount + 1;
                sum = sum + number;
            }
            if (number <= 0) {
                System.out.println("Cannot calculate the average");
            }
        }
        System.out.println(sum / amount);
    }
}
