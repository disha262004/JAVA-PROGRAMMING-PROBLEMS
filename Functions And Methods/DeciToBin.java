public class DeciToBin{
    public static int DTB(int deciNum){
        int binNum = 0;
        int pow = 0;
        
        while(deciNum > 0){
            int rem = deciNum % 2;
            binNum = binNum + (rem *(int)Math.pow(10,pow));
            deciNum = deciNum / 2;
            pow++;
        }
        return binNum;
    }
    public static void main(String args[]){
        System.out.print(DTB(5));
    }
}