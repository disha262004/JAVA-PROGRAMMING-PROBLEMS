public class reverseArray{

    public static void reverse(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while(left < right){

            int temp = arr[left];
            arr[left] = arr[right] ;
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String args[]){
        int arr[] = {4,5,2,3,7,1,9};
        reverse(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}