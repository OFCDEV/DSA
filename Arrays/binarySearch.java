package Arrays;

public class binarySearch {
    static int orderAgnosticBS(int arr[],int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];
        while (start<=end) {
            int mid = start +(end-start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target<arr[mid]) {
                    end = mid-1;
                }
                else if (target>arr[mid]) {
                    start = mid+1;
                }
            }
            else{
                if (target<arr[mid]) {
                    start = mid+1;
                }
                else if (target>arr[mid]) {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {100,90,70,69,67,50,9};
        System.out.println(orderAgnosticBS(arr, 9));
    }
}
