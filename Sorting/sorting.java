public class sorting{
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

    public static void selection_sort(int arr[]){
        for(int i=0 ; i<arr.length-1 ; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length ; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertion_sort(int arr[]){
        for(int i=1 ; i<arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    } 

    public static void main(String args[]){
        int arr[] = {2,3,1,4,6,5};
        // bubble_sort(arr);
        insertion_sort(arr);        
        printArr(arr);        
    }
}