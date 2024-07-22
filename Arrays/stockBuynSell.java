package Arrays;

public class stockBuynSell {
    static int bruteForce(int[] arr){
        int maxPro = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]>arr[i]) {
                    maxPro = Math.max(arr[j]-arr[i], maxPro);
                }
            }
        }
        return maxPro;
    }
    static int optimalSol(int[] arr){
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i]-minPrice);
        }
        return maxPro;
    }
}
