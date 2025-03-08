public class sudukuSolver {

    public static boolean isSafe(char suduku[][] , int row , int col , char digit){

        for(int i=0 ; i<9 ; i++ ){
            if(suduku[i][col] == digit){
                return false;
            }
        }

        for(int j=0 ; j<9 ; j++ ){
            if(suduku[row][j] == digit){
                return false;
            }
        }

        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for(int i=sr ; i<sr+3 ; i++){
            for(int j=sc ; j<sc+3 ; j++){
                if(suduku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean suduku(char suduku[][], int row, int col){
        if(row == 9){
            return true;
        }

        int nextRow = row, nextCol = col+1;

        if(col == 8){
            nextRow = row+1;
            nextCol = 0;
        }

        if(suduku[row][col] != '0'){
            return suduku(suduku, nextRow, nextCol);
        }

        for(char digit='1' ; digit<='9' ; digit++){
            if(isSafe(suduku , row, col , digit)){
                suduku[row][col] = digit;
                if(suduku(suduku, nextRow, nextCol)){
                    return true;
                }
                suduku[row][col] = '0';
            }
        }
        return false;
    }

    public static void printSuduku(char suduku[][]){
        for(int i=0 ; i<9 ; i++){
            for(int j=0 ; j<9 ; j++){
                System.out.print(suduku[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char suduku[][] = {
            {'3', '0', '6', '5', '0', '8', '4', '0', '0'},
            {'5', '2', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '8', '7', '0', '0', '0', '0', '3', '1'},
            {'0', '0', '3', '0', '1', '0', '0', '8', '0'},
            {'9', '0', '0', '8', '6', '3', '0', '0', '5'},
            {'0', '5', '0', '0', '9', '0', '6', '0', '0'},
            {'1', '3', '0', '0', '0', '0', '2', '5', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '7', '4'},
            {'0', '0', '5', '2', '0', '6', '3', '0', '0'}
        };

        if(suduku(suduku , 0 , 0)){
            System.out.println("Solutuion exits");
            printSuduku(suduku);
        } else{
            System.out.println("No solution");
        }
    }
}
