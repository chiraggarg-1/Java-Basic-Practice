import java.util.Scanner;

public class GreatestCommonDiviser {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Enter the value of a");
        int b= sc.nextInt();
        System.out.println("Enter the value of b");
        int n = Math.min(a,b);
//        int x=1;
//        for(int i=1;i<=n;i++){
//            if(a%i==0 && b%i==0){
//                x=i;
//
//            }
//        }
        System.out.println(n);
    }
}
