public class LastOccurence{
    public static int isKey(int arr[], int key,int i){
        int isFound = isKey(arr, 10, i+1);
        if(isFound !=- 1){
            return isFound;
        }
        if(arr[i]==key){
            return i;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,10,4,5,10 , 4};
        System.out.print(isKey(arr,10,0));
    }
}