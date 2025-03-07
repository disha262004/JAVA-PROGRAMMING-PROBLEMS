public class gridWays {
    public static int grid_ways(int i, int j , int n , int m){
        
        if(i==n-1 && j==m-1){
            return 1;
        } else if(i==n || j==m){
            return 0;
        }

        int W1 = grid_ways( i,  j+1 , n , m);
        int W2 = grid_ways( i+1,  j , n, m);
        return W1 + W2;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.print(grid_ways( 0, 0 , n, m));

    }
}
