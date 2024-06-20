import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to do factorial");
       int f=1;
        int N= sc.nextInt();
        for(int i=N;i>=1;i--){
            f=f*i;

        }
        System.out.println(f);

    }
}
