
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            list.add(number);
        }
        // int index = 0;
        System.out.println("From where?");
        int from = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int to = Integer.valueOf(scanner.nextLine());
        while (from <= to) {
            // if (list.size() < from || list.size() > to) {
            //     break;
            // }
            int number = list.get(from);
            System.out.println(number);
            from = from + 1;
        }
    }
}
