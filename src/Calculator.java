import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        System.out.println("Enter the value of a ");
        int b = cin.nextInt();
        System.out.println("Enter the value of b");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Enter the Choice: ");
        int choice = cin.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addition: "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction: "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication: "+(a*b));
                break;
            case 4:
                System.out.println("Divide: "+(a/b));
                break;
            default:
                System.out.println("Please enter the valid value");




        }

    }
}
