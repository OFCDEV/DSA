package Arrays.Searching;

public class bsIn2D {
    static int[] search(int[][] matrix,int target){
        int row = 0;
        int column = matrix.length-1;
        while (row<matrix.length && column>=0) {
            if (matrix[row][column] == target) {
                return new int[]{row,column};
            }
            if (matrix[row][column]<target) {
                row++;
            }else{
                column--;
            }
        }
        return new int[]{-1,-1};
    }
}
