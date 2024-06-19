import java.util.Scanner;

public class SwitchCase {
    public static void main(String [] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Number for finding the day");
        char ch = cin.next().charAt(0);
        switch (ch){
            case 'a':
                System.out.println("Its Monday");
                break;
            case 'b':
                System.out.println("Its Tuesday");
                break;
            case 'c':
                System.out.println("Its Wednesday");
                break;
            case 'd':
                System.out.println("Its Thursday");
                break;
            case 'e':
                System.out.println("Its Friday");
                break;
            case 'f':
                System.out.println("Its Saturday");
                break;
            case 'g':
                System.out.println("Its Sunday !!! Hurray");
                break;
            default:
                System.out.println("Please Enter a Valid Choice");


        }
    }
}
