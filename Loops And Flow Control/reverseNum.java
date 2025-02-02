public class reverseNum {
    public static void main(String[] args) {
        int x=2721;
        int reverse = 0 ;
        while(x!=0){
                int lastDigit = x % 10;
                reverse = (reverse*10)+lastDigit;
                x = x/10;      
        }
        System.out.println(reverse);
        
    }
}
