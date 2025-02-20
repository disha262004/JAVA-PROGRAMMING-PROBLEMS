public class incOrder{
    public static void inc_order(int n){
        if(n==0){
            return;
        }
        inc_order(n-1);
        System.out.print(n + " ");
        
    }
    public static void main(String args[]){
        int n=10;
        inc_order(n);
    }
}