import java.util.*;

public class spiralMatrix{
    public static List<Integer> spiral(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int row_Start = 0;
        int row_End = matrix.length-1;
        int col_Start = 0;
        int col_End =  matrix[0].length-1;
        while(row_Start <= row_End && col_Start <= col_End){
            for(int i = col_Start ; i <= col_End ; i++)
            {
                res.add(matrix[row_Start][i]);
            }
            row_Start++;

            for(int i = row_Start ; i <= row_End ; i++ )
            {
                res.add(matrix[i][col_End]);
            }
            col_End-- ;

            if(row_Start <= row_End)
            {
                for(int i = col_End ; i >= col_Start ; i--)
                {
                  res.add(matrix[row_End][i]);
                }
            }
            row_End-- ;

             if(col_Start <= col_End)
            {
                for(int i = row_End ; i >= row_Start ; i--)
                {
                  res.add(matrix[i][col_Start]);
                }
            }
            col_Start++;
        }
        return res;

    }

    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.print(spiral(matrix));
    }
}