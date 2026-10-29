
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int number = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= number; i++){
            System.out.println(i);
            sum += i; 
        }
        System.out.println("The sum is " + sum);

        // int sum = 0;
        // int i = 1;
        // while (true) {
        //     sum += i;
        //     i++;

        //     if (i == number){
        //         break;
        //     }
        // }
        
        // System.out.println(sum);
    }
    
}
