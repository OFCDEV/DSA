package Arrays.Searching;

public class nextBigLetter {
    static char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;

            if (target<letters[mid]) {
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return letters[start % letters.length];
    }
    public static void main(String[] args) {
        char[] arr = {'a','b','e','h'};
        System.out.println(nextGreatestLetter(arr, 'c'));
    }
}
