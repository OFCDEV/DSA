package Arrays;

public class findDuplicateNum {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] arr){
        int i = 0;
        while (i<arr.length) {
            if (arr[i] != i+1) { //check if element is index+1 or not
                int correctIndex = arr[i]-1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr,i,correctIndex);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
