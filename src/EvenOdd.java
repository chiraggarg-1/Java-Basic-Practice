import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N= cin.nextInt();
        if(N%2==0)
            System.out.println("The number is even no");

        else
            System.out.println("The number is odd no");


    }
}
