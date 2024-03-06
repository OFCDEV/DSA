package Arrays;

public class maxElement {
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    static int maxInRange(int[] arr,int start,int end){
        int maxValue = arr[0];
        for (int i = start; i < end; i++) {
            if (arr[i]>maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int[] arr = {1,45,69,2,96,4};
        System.out.println(max(arr));
        System.out.println(maxInRange(arr,0,3));
    }
}
