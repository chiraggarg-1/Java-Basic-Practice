public class Solution {
    public static void utility(int a, int b){
        int temp;
        temp =a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
   }
    public static void main(String[] args){
        utility(1,2);
    }
}
