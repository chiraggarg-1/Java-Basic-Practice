import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        int z = Math.max(a,b);
        if(z%a==0 && z%b==0){
            System.out.println("The lcm of two number is:"+z);
        }
        else {
            System.out.println("The lcm of two number is:"+(a*b));
        }

    }
}
