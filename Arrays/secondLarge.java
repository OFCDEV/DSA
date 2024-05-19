package Arrays;

public class secondLarge {
    static int secondBig(int arr[],int n){
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            //If the element is greater than the current largest, it updates secondLargest to the current largest and largest to the current element.

            if (arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            //Otherwise, if the element is less than the current largest but greater than the current secondLargest, it updates secondLargest to the current element.
            else if (arr[i] < largest && arr[i]>secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,7};
        System.out.println(secondBig(arr,7));
        
    }
}
