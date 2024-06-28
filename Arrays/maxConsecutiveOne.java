package Arrays;

public class maxConsecutiveOne {
    static int maxOne(int[] arr){
        int count =0;
        int maxI = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }else{
                count = 0;
            }
            maxI = Math.max(maxI, count);
        }
        return maxI;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,1,0,1,1,1,1,1,0,1};
        System.out.println(maxOne(arr));
    }
}
