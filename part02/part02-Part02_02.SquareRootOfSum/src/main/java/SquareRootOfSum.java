
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.valueOf(scan.nextLine());
        int secondNumber = Integer.valueOf(scan.nextLine());
        System.out.println(Math.sqrt(firstNumber+secondNumber));

    }
}
