//Mountain like array or Bitonic array is consist of two parts; one is the Ascending part and another is the descending part.

//Q:-Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

//1st approach to find the peak element is to do BinarySearch in Ascending part, if not found do in the Descending part
package Arrays;

public class peakElement {
    static int search(int[] arr,int target){
        int peak = peakIndex(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        //Try to search in 2nd half
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }
    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int mid = start +(end-start)/2;
            if (arr[mid]>arr[mid+1]) {
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int arr[],int target,int start,int end){
        boolean isAsc = arr[start]<arr[end];
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (isAsc) {
                if (target<arr[mid]) {
                    end = mid-1;
                }else if (target>arr[mid]) {
                    start = mid+1;
                }else{
                    return mid;
                }
            }else{
                if (target<arr[mid]) {
                    start = mid+1;
                }else if (target>arr[mid]) {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,1};
        System.out.println(search(arr, 3));
    }
}
