package Arrays;
import java.util.Arrays;
public class twoSum {
    static int[] twoSumBruteForce(int n,int[] arr,int target){
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
    /*
     * Optimized Approach(using two-pointer): 
     We will sort the given array first.
     Now, we will take two pointers i.e. left, which points to the first index, and right, which points to the last index.
    Now using a loop we will check the sum of arr[left] and arr[right] until left < right.
    If arr[left] + arr[right] > sum, we will decrement the right pointer.
    If arr[left] + arr[right] < sum, we will increment the left pointer.
    If arr[left] + arr[right] == sum, we will return the result.
    Finally, if no results are found we will return “No” or {-1, -1}.

    Time-Complexity = 0(N)+0(N log N)
     */
    static String twoSumOptimal(int n,int[] arr,int target){
        Arrays.sort(arr);
        int left=0,right=n-1;
        while (left<right) {
            int sum = arr[left]+arr[right];
            if (sum == target) {
                return "YES";
            }else if(sum<target) left++;
            else right--;
        }
        return "NO";
    }
    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSumBruteForce(n, arr, target);
        System.out.println(Arrays.toString(ans));

    }
}
