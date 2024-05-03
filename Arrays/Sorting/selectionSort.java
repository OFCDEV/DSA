//Select the largest element in the array and swap it with its correct index(end)
//Time complexity-0(n^2)
//Not Stable
//Use Case-Performs well in short list
package Arrays.Sorting;
import java.util.Arrays;
public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find max item in the remaining array and swap with correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swapArray(arr, maxIndex, last);
        }
    }

     static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <=end; i++) {
            if (arr[max]< arr[i]) {
                max = i;
            }
        }
        return max;
    }
    static void swapArray(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
