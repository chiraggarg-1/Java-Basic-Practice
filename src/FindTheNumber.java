import java.util.Scanner;

public class FindTheNumber {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Number");
        int N = cin.nextInt();
         {
            if (N > 0 && N % 2 == 0) {
                System.out.println("The number is Positive and Even ");

            } else if (N < 0 && N % 2 == 0) {
                System.out.println("The number is Negative and Even");

            } else if (N > 0) {
                System.out.println("The number is Positive and Odd");

            } else if (N < 0) {
                System.out.println("The number is negative and Odd");

            } else {
                System.out.println("Invalid No");
            }

        }
    }
}
