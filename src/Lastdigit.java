import java.util.Scanner;

public class Lastdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a N");
        int N = sc.nextInt();
        int d = N%10;
        System.out.println("The last digit is " +d);

    }
}
