//Pivot-Choose any element
//After the first pass all the elements < Pivot will be on LHS and > P will be on RHS

//In merge sort if an array is already sorted it still merges the arrays,so thats why we use QuickSort

//Time complexity 0(n logn)-->Best Case; 0(n^2)-->worst case
//Not stable
package Arrays.Sorting;
import java.util.Arrays;
public class quicksort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums, int low,int high){
        if (low>=high) {
            return;
        }
        int s = low;
        int e = high;
        int m =s+(e-s)/2;

        int pivot = nums[m];
        while (s<=e) {
            while (nums[s]<pivot) {
                s++;
            }
            while (nums[e]>pivot) {
                e--;
            }
        }
        //Swapping
        if (s<=e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
        //When pivot is in correct position, we just simply swap both sides
        sort(nums, low, e);
        sort(nums, s, high);
    }
}
