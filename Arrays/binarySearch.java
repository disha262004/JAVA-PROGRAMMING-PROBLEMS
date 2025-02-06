public class binarySearch{
    public static int search(int arr[] , int target){
        int first = 0;
        int last = arr.length-1;

        while(first <= last){
            int mid = (first+last)/2;
            if(arr[mid] == target){
                return mid;
            } 
            else if (arr[mid] < target){
                first = mid+1;
            } 
            else if (arr[mid] > target){
                last = mid-1;
            }
            first++;
            last--;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,5,12,26,27};
        int target = 26;
        System.out.print(search(arr, target));
    }
}