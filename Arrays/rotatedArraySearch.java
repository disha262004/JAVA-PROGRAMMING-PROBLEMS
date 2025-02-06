//Search in rotated array
public class rotatedArraySearch{
    public static int search(int nums[] , int target){
        int start = 4;
        int end = 7;

        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            start++;
            end--;
        }

        return -1;
    }

    public static void main(String args[]){
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.print(search(nums, target));
    }
}