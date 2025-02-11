public class diagonalSum{
    public static int diagonal(int mat[][]){
        int sum = 0;
        int n = mat.length;
        for(int i=0 ; i<n ; i++){
            sum += mat[i][i];
        }
        for(int i=n-1 ; i>=0 ; i--){
            sum += mat[n-i-1][i];
        }
        if(n%2 != 0){
            sum -= mat[(n-1)/2][(n-1)/2];
        }
        return sum;
    }
    public static void main(String args[]){
        int mat[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.print(diagonal(mat));
    }
}