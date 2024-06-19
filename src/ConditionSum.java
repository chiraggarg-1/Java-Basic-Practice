import java.util.Scanner;

public class ConditionSum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N =sc.nextInt();
        int S =0;
        if(N>0){
            for(int i=1;i<=N;i++){
                 S = S+i;
            }
            System.out.println("The sum of N natural no is "+S);
        }else {
            System.out.println("Plese enter the valid Value");
            return;
        }
    }
}
