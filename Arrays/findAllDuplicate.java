package Arrays;
import java.util.List;
import java.util.ArrayList;
public class findAllDuplicate {
    public List<Integer> findDup(int[] arr){
        int i = 0;
        while(i<arr.length){
            int corIndex = arr[i]-1;
            if (arr[i] != arr[corIndex]) {
                swap(arr,i,corIndex);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
