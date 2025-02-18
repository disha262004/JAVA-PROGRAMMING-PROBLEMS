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
        int bitMask = 1<<i;
        if((n&bitMask) == 0){
            return 0;
        } else{
            return 1;
        }
    }

    //Set ith bit
    public static int setithBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }

    //Clear ith bit
    public static int clearIthBit(int n, int i){
        int bitMask = 1<<i;
        return n & ~bitMask;
    }

    // Update ith But
    public static int updateIthBit(int n, int i, int newBit){
        int bitMask = 1<<i;
        if(newBit == 0){
            return n & bitMask;
        } else {
            return n | bitMask;
        }
    }

    //Clear Last I Bits
    public static int clearLastIthBit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    //Clear in range from j to i
    public static int clearBitsRange(int n, int i,int j){
        int a = (~0)<<j;
        int b = (1<<i)-1;
        
        return n&(a|b);
    }

    public static void main(String args[]){
        // oddEven(3);
        // oddEven(12);
        // oddEven(5);
        // System.out.print(setithBit(10,2));
        // System.out.print(clearIthBit(10,1));
        System.out.print(clearBitsRange(10,2,4));

    }
}