public class OnlyBreak {
    public static void main(String [] args){
        int i;
        for(i=0;i<5;i++){
            if(i==3)
                break;
            System.out.println(i);
        }
        System.out.println(i);
    }
}
