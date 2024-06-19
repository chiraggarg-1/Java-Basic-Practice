import java.util.Scanner;

public class MaxOfNumber {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the value of a");
         int a = cin.nextInt();
        System.out.println("Enter the value of b");
        int b = cin.nextInt();
        System.out.println("Enter the value of c");
        int c = cin.nextInt();
        int sol = Math.max(a,b);
        int sol1 = Math.max(sol,c);
        System.out.println("The largest No is:"+sol1);
    }
}
