

public class factorial {
    public static int n_factorial(int n){
        int fact=1;
        for(int i=2 ; i<=n ; i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(n_factorial(5));
    }
}
