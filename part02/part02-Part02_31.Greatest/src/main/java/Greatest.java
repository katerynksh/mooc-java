
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int n1 = number1;
        int n2 = number2;
        int n3 = number3;
        int result = 0;
        if (n1 < n2 && n2>n3) {
            result = n2;
        } else if (n1 > n2 && n1 > n3){
            result = n1;
        } else {
            result = n3;
        }

        return result;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}