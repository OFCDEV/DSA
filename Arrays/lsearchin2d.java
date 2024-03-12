package Arrays;

import java.util.Arrays;

public class lsearchin2d {
    public static void main(String[] args) {
        int [][] arr= {{10,32,12},{69,68,96},{56,76},{43,777,987,432,122}};
        int target = 432;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
