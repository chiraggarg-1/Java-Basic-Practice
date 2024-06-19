import java.sql.SQLOutput;
import java.util.Scanner;

public class CountTheDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N= sc.nextInt();
        int i=0;
        while (N>0){
            N=N/10;
            i++;
        }
        System.out.println(i);


    }
}
