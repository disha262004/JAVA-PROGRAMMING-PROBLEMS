public class linearSearch{
    public static int search(int arr[] , int target){
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    } 
    public static void main(String args[]){
        int arr[] = {4,2,3,5,6,8};
        int target = 10;
        System.out.print(search(arr,target));
    }
}