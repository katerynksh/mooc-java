
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double newSum = sum;
        int count = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            sum += number;
            newSum = sum;
            count += 1;
            if (number %2 == 0) {
                even ++;
            } else {
                odd ++;
            }     

            if (number == -1) { 
                sum++;
                newSum++;
                count --;

                
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                System.out.println("Average: " +(((newSum) / count)));
                System.out.println("Even: " + even);
                System.out.println("Odd: " + (odd - 1));             
                break;
            }                

            
        }

    }
}
