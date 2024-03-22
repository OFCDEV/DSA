//Binary search in an infinte length of array
package Arrays;

public class bsInInfinteArr {
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start +(end-start)/2;
            if (target<arr[mid]) {
                end = mid-1;
            }
            else if (target>arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int findingRange(int[] arr,int target){
        //Find the range-->
        //First start with range of 2
        int start=0;
        int end=1;

        //Condition when doubling the size: While your target element is greater than the end just double the range.
        while (target>arr[end]) {
            int newStart = end+1;
            //double the size-> end = previous end + sizeOfBox*2
            end = end + (end-start+1)*2;
            start = newStart; //updating the start
        }
        return binarySearch(arr, target, start, end);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,7,9,10,90,100,130,140,160,170};
        System.out.println(findingRange(arr, 10));
    }
}
