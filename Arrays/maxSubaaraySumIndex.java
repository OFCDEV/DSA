package Arrays;

public class maxSubaaraySumIndex {
    static long solution(int[] arr){
        long maxSum = Long.MIN_VALUE;
        long sum = 0;

        int start = 0;
        int subArrStart = -1,subArrEnd=-1;

        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                subArrStart = i;
            }

            sum+=arr[i];

            if (sum>maxSum) {
                maxSum=sum;

                subArrStart=start;
                subArrEnd=i;
            }

            if (sum<0) {
                sum=0;
            }
        }
        //Printing the subarray
        System.out.print("The subarray is: [");
        for (int i = subArrStart; i < subArrEnd; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]\n");

        return maxSum;
    }
    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        long maxSum = solution(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }
}
