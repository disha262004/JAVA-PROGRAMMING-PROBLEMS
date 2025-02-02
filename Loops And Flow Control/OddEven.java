public class OddEven {
    public static void main(String[] args) {
        int n = 12456;
        int evenSum=0;
        int oddSum=0;

        while(n>0){
            int lastDigit = n%10;
            if(lastDigit % 2 ==0 ){
                evenSum+=lastDigit;
            } else{
                oddSum+=lastDigit;
            }
            n=n/10;
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
