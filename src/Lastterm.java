import java.util.Scanner;

public class Lastterm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of First Term");
        int ft = sc.nextInt();
        System.out.println("Enter the value of Total Number");
        int n = sc.nextInt();
        System.out.println("Enter the value of Common Difference");
        int cd = sc.nextInt();
        int an= ft+(n-1)*cd;
        System.out.println("The last term is "+an);

    }
}
