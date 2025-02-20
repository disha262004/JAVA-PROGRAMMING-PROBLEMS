public class FirstOccurence{
    public static int isKey(int arr[], int key,int i){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return isKey(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,6,4,5};
        System.out.print(isKey(arr,10,0));
    }
}