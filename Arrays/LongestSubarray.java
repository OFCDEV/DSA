package Arrays;

public class LongestSubarray {
    public static int getLongestSubarray(int []a, long k) {
        int n = a.length;

        int len = 0;
        for (int i = 0; i < n; i++) { 

            long s = 0; // Sum variable
            for (int j = i; j < n; j++) { 
                // add the current element to the subarray a[i...j-1]:
                s += a[j];

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }
    public static int getLongestSubarrayOptimal(int []a, long k) {
        int n = a.length;
        int left=0;
        int right=0;
        long sum = a[0];
        int maxLen = 0;
        while (right<n) {
            //If sum>k,reduce the subarray from left
            while (left<=right && sum>k) {
                sum -=a[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++; //Move the right pointer
            if(right<n) sum+=a[right];

        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarrayOptimal(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
