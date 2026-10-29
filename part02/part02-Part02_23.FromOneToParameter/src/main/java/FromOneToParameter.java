import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            // System.out.println("How many times?");
        int numberOfTimes = Integer.valueOf(scanner.nextLine());
        printUntilNumber(numberOfTimes);
            
    }
    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printUntilNumber(int numberOfTimes) {
        // write some code here
        int i = 1;
        while (i <= numberOfTimes) {
            System.out.println(i);
            i++;
        }
    }

}
