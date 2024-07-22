package Arrays.Sorting;

public class revereserArray {
    static void iterativeMethod(int[] arr){
        int ptr1=0,ptr2=arr.length-1;
        while (ptr1<ptr2) {
            int temp = arr[ptr1];
            arr[ptr1] = arr[ptr2];
            arr[ptr2] = temp;
            ptr1++;
            ptr2--;
        }
    }
    static void recursiveMethod(int arr[],int start,int end){
    
        if (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            recursiveMethod(arr, start+1, end-1);
        }
    }
}
