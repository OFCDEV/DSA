package Arrays;
import java.util.*;
public class RearrangebySign {
    static ArrayList<Integer> optimalSol(ArrayList<Integer> A){
        int n = A.size();

        //Defining an array for storing the Ans
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

        int posNum = 0,negNum=0;
        for (int i = 0; i < n; i++) {
            //Fill -ve elements in odd indices and inc by 2.
            if (A.get(i)<0) {
                ans.set(negNum, A.get(i));
                negNum+=2;
            }else{
                ans.set(posNum, A.get(i));
                posNum+=2;
            }
        }
        return ans;
    }
}
