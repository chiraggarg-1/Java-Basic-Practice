import java.util.Scanner;

public class Divisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to find the divisor");
        int N= sc.nextInt();
        for(int i=1;i<=N;i++){
            if(N%i==0){
                System.out.println(i);
            }
        }
    }
}
