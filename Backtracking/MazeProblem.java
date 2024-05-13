//Note that row and column starts from (3,3) in a 3*3 matrix

package Backtracking;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println("No of ways to reach the last index is: "+count(3, 3));
    }
    static int count(int r, int c){
        if (r ==1 || c == 1) {
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r, c-1);

        return left+right;
    }
    
}
