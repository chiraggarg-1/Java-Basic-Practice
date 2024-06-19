import java.util.Scanner;

public class BreakndContinue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter the value of a");
            int a = sc.nextInt();
            System.out.println("Enter the value of b");
            int b = sc.nextInt();
            if(b==0)
                continue;
            System.out.println("The result is "+a/b);
        }
    }
}
