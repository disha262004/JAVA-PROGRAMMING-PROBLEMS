public class maxSubarraySum{
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

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        System.out.print("Largest sum is : " +subArr(arr));
    }
}