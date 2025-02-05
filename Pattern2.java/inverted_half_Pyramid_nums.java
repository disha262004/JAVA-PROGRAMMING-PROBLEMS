public class inverted_half_Pyramid_nums{
    public static void pattern(int n){
        for(int i=1 ; i<=n ; i++){
            int k=1;
            for(int j=1 ; j<=n-i+1 ; j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(5);
    }
}