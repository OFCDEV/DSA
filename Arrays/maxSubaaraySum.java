package Arrays;

public class maxSubaaraySum {
    static int bruteForce(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];

                maxSum=Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
    //Intuition-->
    //A subarray with a sum less than 0 will always reduce our answer and so this type of subarray cannot be a part of the subarray with maximum sum.
    /*Approach-->
     * The steps are as follows:

We will run a loop(say i) to iterate the given array.
Now, while iterating we will add the elements to the sum variable and consider the maximum one.
If at any point the sum becomes negative we will set the sum to 0 as we are not going to consider it as a part of our answer.
     */
    static long optimalSol(int[] arr){
        long maxSum = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

            if (sum>maxSum) {
                maxSum=sum;
            }

            //If sum<0: Discard the calculation
            if (sum<0) {
                sum = 0;
            }
            //the sum of the empty subarray
            if (maxSum<0) {
                maxSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        long maxSum = optimalSol(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }
}
