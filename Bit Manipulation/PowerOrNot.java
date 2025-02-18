public class PowerOrNot{
    public static boolean powerOrNot(int n){
        if((n & (n-1)) == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        System.out.print(powerOrNot(8));
    }
}