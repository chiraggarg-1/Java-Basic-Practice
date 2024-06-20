import java.sql.SQLOutput;
import java.util.Scanner;

public class FirstDigitOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int N = sc.nextInt();
        while (N>10){
            N=N/10;
        }
        System.out.println(N);
    }
}
