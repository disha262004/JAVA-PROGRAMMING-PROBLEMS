public class SameElement{
    public static void printSameElement(int arr[], int key,int i){
        if(i == arr.length-1){
            return ;
        }
        if(arr[i] == key){
            System.out.print(i+" ");
        }
        i++;
        printSameElement(arr,key, i+1);
    }
    public static void main(String args[]){
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        printSameElement(arr,key,0);
    }
}