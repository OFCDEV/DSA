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
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid]<target) {
                start = mid+1;
            }else if (arr[mid]>target) {
                end = mid-1;
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
            if (arr[mid]<arr[mid-1]) {
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
}
