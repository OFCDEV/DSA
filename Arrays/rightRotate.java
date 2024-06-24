package Arrays;

import java.util.Arrays;

public class rightRotate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = 5; // size of the array
        int d = 3; // no of rotations
        rotateRight(arr, n, d);
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

    static void rotateRight(int arr[], int n, int d) {
        // Reverse the entire array
        reverse(arr, 0, n - 1);

        // Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Reverse the remaining n-d elements
        reverse(arr, d, n - 1);
    }
}
