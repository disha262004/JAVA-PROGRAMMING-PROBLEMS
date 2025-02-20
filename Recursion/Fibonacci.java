public class Fibonacci{
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int num = fibonacci(n-1)+fibonacci(n-2);
        return num; 
    }
    public static void main(String args[]){
        int n=6;
        System.out.print(fibonacci(n));
    }
}