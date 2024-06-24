package Arrays;

import java.util.Arrays;

public class leftRotate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = 5; //size of the array
        int d = 3;//no of rotation
        rotateLeftToRight(arr, n, d);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateLeftToRight(int arr[], int n, int d) {

        // reversing the entire array
        reverse(arr, 0, n - 1);

        // reversing first n-d elements
        reverse(arr, 0, n -d- 1);

        // reverse the last d elements
        reverse(arr, n - d, n - 1);

    }
}
