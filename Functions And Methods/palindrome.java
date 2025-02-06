public class palindrome{

    public static int reverseNum(int n){
        int reverse = 0 ;
        while(n!= 0){
                int lastDigit = n % 10;
                reverse = (reverse*10)+lastDigit;
                n = n/10;      
        }
        return reverse; 
    }

    public static boolean isPalindrome(int n){
        if(n == reverseNum(n)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.print(isPalindrome(131));
    }
}
