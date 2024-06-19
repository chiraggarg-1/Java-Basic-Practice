import java.util.Scanner;

public class Lasttermgp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of First term");
        int a = sc.nextInt();
        System.out.println("Enter the value of R");
        int r = sc.nextInt();
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        int gn = ((a)*(r^(n-1)));
        System.out.println("The nth term of gp is "+gn);

    }
}
