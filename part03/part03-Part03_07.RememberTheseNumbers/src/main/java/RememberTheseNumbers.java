
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int index = 0;
        while (index < list.size()) {
            int number = list.get(index);
            System.out.println(number);
            index = index + 1;
        }
    
    }
}
