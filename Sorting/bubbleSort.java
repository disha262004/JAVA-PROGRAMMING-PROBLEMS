public class bubbleSort{
    public static void bubble_sort(int arr[]){
        for(int turn=0 ; turn<arr.length-1 ; turn++){
            for(int i=0; i<arr.length-turn-1 ; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    } 

    public static void main(String args[]){
        int arr[] = {2,3,1,4,6,5};
        bubble_sort(arr);
        printArr(arr);
        
    }
}