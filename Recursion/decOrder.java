public class decOrder{
    public static void dec_order(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        dec_order(n-1);
    }
    public static void main(String args[]){
        int n=10;
        dec_order(n);
    }
}