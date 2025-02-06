public class binToDeci{
    public static int BTD(int binNum){
        int pow = 0;
        int deciNum = 0;
        while(binNum > 0 ){
            int lastDigit = binNum % 10;
            deciNum = deciNum + (lastDigit * (int)Math.pow(2,pow));
            binNum = binNum/10;
            pow++;
        }
        return deciNum;
    }
    public static void main(String args[]){
        System.out.print(BTD(101));
    }
}