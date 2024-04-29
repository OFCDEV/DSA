//Compare two neighbour elements and swap;
//Time complexity- 0(n^2)
//Stable
package Arrays.Sorting;

import java.util.Arrays;

public class bubbleSorting {

    public static void main(String[] args) {
        int[] arr = {4,3,5,6,2,8,1};
        BS(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BS(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}