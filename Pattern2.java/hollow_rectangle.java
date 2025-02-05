public class hollow_rectangle{
    public static void hollowRectangle(int m,int n){
        for(int i=1 ; i<=m ; i++){
            for(int j=1 ; j<=n ; j++){
                if(i==1 || j==1 || i==m || j==n){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollowRectangle(4,5);
    }
}