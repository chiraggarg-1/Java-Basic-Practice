import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Check It's Prime or Not");
        int N= sc.nextInt();
        int count=0;
        for(int i=2;i<N;i++){
            if(N%i==0) {
                count++;
            }


        }
        if(count==2){
            System.out.println("Not Prime Number");
        }else{
            System.out.println("Prime Number");
        }
    }
}
