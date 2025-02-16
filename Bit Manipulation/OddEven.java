public class OddEven{
    public static void oddEven(int n){
        int bitMask=1;
        if((n&bitMask) == 0){
            System.out.print("Even");
        } else{
            System.out.print("Odd");
        }
    }

    // ith bit 
    public static int ithBit(int n, int i){
        int bitMask = 1;
        if((n&bitMask) == 0){
            return 0;
        } else{
            return 1;
        }
    }
    public static void main(String args[]){
        // oddEven(3);
        // oddEven(12);
        // oddEven(5);
        System.out.print(ithBit(10,3));

    }
}