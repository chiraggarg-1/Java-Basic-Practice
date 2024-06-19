import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = cin.nextInt();
        System.out.println("Enter the value of b:");
        int b = cin.nextInt();
        System.out.println("Enter the value of c:");
        int c = cin.nextInt();
        if(a>b &&a>c){
            System.out.println("a is the largest");
        } else if (b>a && b>c) {
            System.out.println("b is the largest");
        }
        else {
            System.out.println("c is the largest");
        }

    }
}
