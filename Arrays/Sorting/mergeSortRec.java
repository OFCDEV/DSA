package Arrays.Sorting;
import java.util.Arrays;
public class mergeSortRec {
    
    static int[] mergeSort(int arr[]){
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length/2;

        //Arrays.copyOfRange returns a copy with a certain range
        int left[] = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        
        //Create a new array having length of both the arrays
        int mix[] = new int[first.length+second.length];

        //Now create three(two can) pointers
        int i = 0; //Pointer for 1st array
        int j = 0; //Pointer for 2nd array
        int k = 0; //Pointer for mix array


        //Now while the pointers of 1st and 2nd array is smaller than the array itself compare the 1st pointer with 2nd pointer and add them to the mix array.
        while (i<first.length && j<second.length) {
            if (first[i]<second[j]) {
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //Now it may be possible that one of the array is smaller than other, so in this case we just simply add rest of the element to the mix array(As they're already in a sorted manner)
        while (i<first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j<second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
