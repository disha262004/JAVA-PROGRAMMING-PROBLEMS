public class largestElement{
    public static int largest(int arr[] ){
        int largest = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    } 
    public static void main(String args[]){
        int arr[] = {4,2,3,5,6,8};
        System.out.print(largest(arr));
    }
}