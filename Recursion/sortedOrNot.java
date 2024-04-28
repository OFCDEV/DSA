package Recursion;

public class sortedOrNot {
    static boolean isSorted(int arr[],int index){
        //base case
        if (index == arr.length-1) {
            return true;
        }
        return arr[index]<arr[index+1] && isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int index = 0;
        System.out.println(isSorted(arr, index));
    }
}