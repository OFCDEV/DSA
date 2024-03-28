//Remove an element and return the count of other elements
package Arrays.Searching;

public class removeElements {
    static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr, 2));
    }
}
