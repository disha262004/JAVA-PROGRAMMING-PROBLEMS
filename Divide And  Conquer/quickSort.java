public class quickSort{
    public static void quick_sort(int arr[],int start , int end){
        if(start >= end){
            return;
        }
        int pIdx = partition(arr,start,end);
        quick_sort(arr, start, pIdx-1);
        quick_sort(arr, pIdx+1, end);
    }
    public static int partition(int arr[],int start,int end){
        int pivot = arr[end];
        int i = start -1 ;
        for(int j=start ; j<end ; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i ;

    }

    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" " );
        }
    }
    public static void main(String args[]){
        int arr[]  = {2,4,5,7,4,6,1};
        quick_sort(arr, 0 , arr.length-1);
        printArr(arr);
        
    }
}