package Arrays.Sorting;

public class mergeSort {
    static void mergerInPlace(int[] arr,int s,int e){
        if (e-s == 1) {
            return;
        }
        int mid = s+(e-s)/2;

        mergerInPlace(arr, s, mid);
        mergerInPlace(arr, mid, e);

        merge(arr,s,mid,e);
    }

     static void merge(int[] arr, int s, int mid, int e) {
        int mix[] = new int[e-s];

        int i = s;
        int j = mid;
        int k = 0;

        while(i<mid && j<e){
            if (arr[i]<arr[j]) {
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
