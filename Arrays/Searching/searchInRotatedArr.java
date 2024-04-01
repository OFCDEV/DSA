/*
Find the pivot; Pivot=From where the next elements are asc.
 * When mid>mid+1 that is the pivot element
 * Or when mid<mid-1
 */

package Arrays.Searching;

public class searchInRotatedArr {
    static int BS(int arr[],int target,int start,int end){
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (target>arr[mid]) {
                start = mid+1;
            }else if (target<arr[mid]) {
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start +(end-start)/2;

            //4 cases
            if (mid<end && arr[mid]>arr[mid+1]) {
                return mid; //Here we add the condition i,e mid<end to avoid array out of bound exception
            }
            if (mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if (arr[mid]<=arr[start]) {
                //Dont search in 2nd part
                end = mid-1;
            }else{
                //after mid; 2nd part
                start = mid+1;
            }
        }
        return -1;
    }
    static int search(int[] arr,int target){
        int pivot = findPivot(arr);

        //if you didnt find a pivot, it means the array is not rotated
        if (pivot == -1) {
            return BS(arr, target, 0, arr.length-1);
        }
        //if pivot is found, you have 2 asc sorted arrays
        // 3 cases
        //Case-1: pivot == target
        if (arr[pivot] == target) {
            return pivot;
        }
        //case2:target > start; search space is reduced to (start,pivot-1) bucz all elements after pivot are smaller than start
        if (target>=arr[0]) {
            return BS(arr, target, target, pivot-1);
        }
        //case3:target<start; search in another part of the array; search space = (pivot+1,end)
        return BS(arr, target, pivot+1, arr.length-1);

    }
    //LEATCODE ANS:
    // static int search(int[] nums, int target) {
    //     int n = nums.length ;
    //     int low = 0 , high = n-1; 
 
    //     while(low <= high){
    //         int mid = (low + high) / 2;
    //         if(nums[mid] == target)  return mid ;
 
    //          //we have to check whether left part is sorted or not
    //         if(nums[low] <= nums[mid]) {
    //              if(nums[low] <= target && target <= nums[mid])
    //                  high = mid-1;
    //              else
    //                  low = mid + 1;
    //         }else{
    //             //if left part is not sorted then obviously the right part is sorted one 
    //              if(nums[mid+1] <= target && target <= nums[high])
    //                  low = mid+1;
    //              else
    //                  high = mid-1;
    //         }
    //      }
 
    //      return -1;
    //  }
}
