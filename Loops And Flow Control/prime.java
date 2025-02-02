public class prime {
    public static void main(String[] args) {
        int num = 8;
        boolean isPrime = true;

        for(int i=2 ; i<=num-1 ; i++){
            if (num%i == 0) {
                isPrime = false;
            } 
        }
        System.out.println(isPrime);
    }
}
