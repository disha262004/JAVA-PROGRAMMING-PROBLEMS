public class number_pyramid{
    public static void pattern(int n){
        for(int i=0 ; i<=n ; i++){
            for(int j=0 ; j<n-i-1 ; j++){
                System.out.print("*");
            }
            for(int j=1 ; j<=(2*i)+1 ; j++){
                if((i+j) % 2 == 0){
                    System.out.print(i+1);
                }else{
                    System.out.print(" ");
                }
                
            }
            
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(5);
    }
}