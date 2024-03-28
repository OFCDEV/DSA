package Arrays.Searching;

public class floorProb {
    static int floor(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;
        while (start<=end) {
            if (target<arr[mid]) {
                end = mid-1;
            }else if (target>arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,10,19,23,66,90};
        System.out.println(floor(arr, 16));
    }
}
