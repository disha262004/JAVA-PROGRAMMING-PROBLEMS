public class majorityElement{

    public static int majority_element(int arr[]){
        return majority(arr, 0, arr.length-1);
    }

    public static int majority(int arr[],int low , int high){
        if(low == high){
            return arr[low];
        }

        int mid = low + (high-low)/2;
        int leftMajor = majority(arr,low, mid);
        int rightMajor = majority(arr,mid+1, high);

        if(leftMajor == rightMajor){
            return leftMajor;
        }

        int leftCount = countFrequency( arr, leftMajor , low , high);
        int rightCount = countFrequency( arr, rightMajor , low , high);

        return leftCount > rightCount ? leftMajor : rightMajor;
    }

    public static int countFrequency(int arr[], int element , int low , int high){
        int count = 0;
        for(int i = low ; i<=high ; i++){
            if(arr[i] == element){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[] = {2,2,1,1,1,2,2};
        System.out.print(majority_element(arr));
    } 
}