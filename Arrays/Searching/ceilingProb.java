//An array is given and we have to find the ceiling of a target element.
//Ceiling = Smallest element in array greater or equal to the target element.


package Arrays.Searching;

public class ceilingProb {
    static int ceilingQ(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;
        while (start<=end) {
            if (target<arr[mid]) {
                end =mid-1;
            }else if(target>arr[mid]){
                end = mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,7,8,11};
        System.out.println(ceilingQ(arr, 6));
    }
}
