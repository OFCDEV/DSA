package Arrays.Sorting;

public class isSorted {
    static boolean sortedOrNot(int arr[], int n) {
        boolean ascending = true;
        
        // Check if the array is in ascending order
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                ascending = false;
                break;
            }
        }
        
        // If not in ascending order, check if it's in descending order
        if (!ascending) {
            for (int i = 1; i < n; i++) {
                if (arr[i] > arr[i - 1]) {
                    return false; // Array is not sorted
                }
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,4,5};
        System.out.println(sortedOrNot(arr,5));
    }
}
