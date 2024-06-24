package Arrays;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

//BruteForce
public class movingAllZeros {
    static List<Integer> moveZeros(int n, ArrayList<Integer> arr) {
        ArrayList<Integer> temp = new ArrayList<>();

        // Step 1: Create a temp array and put all the non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr.get(i) != 0) {
                temp.add(arr.get(i));
            }
        }

        // Step 2: Fill the remaining positions with zeros
        while (temp.size() < n) {
            temp.add(0);
        }

        return temp;
    }
    //Optimal Solution
    public int[] moveZeroesOptimal(int[] a) {
        int j = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                if (j != -1) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    j++;
                }
            } else { //if a[i]=0
                if (j == -1) {
                    j = i;
                }
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3));
        List<Integer> result = moveZeros(n, arr);
        System.out.println(result);
    }
}

