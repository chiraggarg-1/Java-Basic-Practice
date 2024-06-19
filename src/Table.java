import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Table digit");
        int N = sc.nextInt();
       int i=1;int T;
       while (i<=10){
            T=N*i;
            i++;
            System.out.println(T);
        }
    }
}
