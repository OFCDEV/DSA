package Arrays.Sorting;

public class ifSortedOrRotated {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(nums[i] > nums[(i+1)%n]){
                ++count;
            }
        }

        return (count <= 1);
    }
}
