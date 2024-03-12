package Arrays;
import java.util.Arrays;
public class removeElement {
    static int[] removedArr(int[] arr,int index){
        if(arr == null || index<0 || index>arr.length){
            return arr;
        }
        int [] newArr = new int[arr.length-1];
        for (int i = 0,k=0; i < newArr.length; i++) {
            if (i == index) {
               continue;
            }
            newArr[k++] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 }; 
        System.out.println("Original Array: "+ Arrays.toString(arr));
        int index = 1;
        System.out.println("New array is: "+Arrays.toString(removedArr(arr, index)));
    }
}
