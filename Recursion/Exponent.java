public class Exponent{
    public static int exponent(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPow = exponent(x,n/2);
        if(n % 2 == 0){
            return halfPow * halfPow;
        }else{
            return x * halfPow* halfPow;
        }
    }
    public static void main(String args[]){
        System.out.print(exponent(2,10));
    }
}