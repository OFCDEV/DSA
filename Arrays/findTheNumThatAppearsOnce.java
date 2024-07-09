package Arrays;

public class findTheNumThatAppearsOnce {
    static int bruteForce(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == num) {
                    count++;
                }

                if (count == 1) return num;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println("The single element is: " + bruteForce(arr));

    }
}
