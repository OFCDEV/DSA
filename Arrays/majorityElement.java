package Arrays;

public class majorityElement {
    static int bruteForce(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count>arr.length/2) {
                return arr[i];
            }
        }
        return -1;
    }
    //Optimal Approach: Moore’s Voting Algorithm:
    /*Initialize 2 variables:
Count –  for tracking the count of element
Element – for which element we are counting
Traverse through the given array.
If Count is 0 then store the current element of the array as Element.
If the current element and Element are the same increase the Count by 1.
If they are different decrease the Count by 1.
The integer present in Element should be the result we are expecting  */

    static int optimalSol(int[] arr){
        int n = arr.length;
        int count = 0;
        int element = 0;

        //Traversing through the array
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count=1;
                element=arr[i];
            }else if (element == arr[i]) {
                count++;
            }else count--;
        }
        //Check if the stored element is the majority or not
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                count1++;
            }
        }
        if (count1>(n/2)) {
            return element;
        }
        return -1;
    }
    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = bruteForce(arr);
        int ans1 = optimalSol(arr);
        System.out.println("The majority element is: " + ans);
        System.out.println("The majority element is: " + ans1);

    }
}
