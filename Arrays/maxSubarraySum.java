public class maxSubarraySum{

    //Brute Force Approach
    public static int subArr(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            int start = i;
            for(int j=i ; j<arr.length ; j++){
                int end = j;
                int sum = 0;
                for(int k=start ; k<=end ; k++){
                    sum = sum+arr[k];
                    System.out.print(arr[k]+" " );
                }
                System.out.print ("sum:" +sum);
                if(sum > largest){
                    largest = sum;
                }

                System.out.println();
            }
            System.out.println();
        }
        return largest;
    }

    //PREFIX Sum Approach
    public static int subArr2(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            int sum = 0;
            for(int j=i ; j<arr.length ; j++){
                sum = sum+arr[j];
                System.out.print ("sum:" +sum);
            }
            if(sum > largest){
                largest = sum;
            }

            System.out.println();
        }
        return largest;
    }

    //Kadans Approach
    public static int subArr3(int arr[]){
        int currSum = 0 ;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0 ; i<arr.length ; i++){
            currSum += arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }

    public static void main(String args[]){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.print("Max sum is : " +subArr3(arr));
    }
}