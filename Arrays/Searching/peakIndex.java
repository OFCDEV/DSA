package Arrays.Searching;

public class peakIndex {
    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while ((start< end)) {
            int mid = start + (end -start)/2;
            if (arr[mid]>arr[mid+1]) {
                //You are in the descending part of the array
                end = mid; //This maybe the ans,but look at the left this is why end != mid-1
            }else{
                 //You are in the acsending part of the array
                start = mid+1; //Bcuz we know that mid+1 element > mid element
            }
        }
        //In the end, start == end and pointing to the largest number of the above 2 conditions.
        //start and end are always trying to find max element in the above checks
        //Hence when they are poinnting to just one element, this is the max one
        return start; //return end; both are same at last.
    }
}
