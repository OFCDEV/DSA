package Arrays.Searching;

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
        int arr[] = {1,2,3,4,7,8,9,22};
        System.out.println(orderAgnosticBS(arr, 5));
    }
}
