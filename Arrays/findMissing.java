package Arrays;

public class findMissing {
    static int findNum(int[] arr,int n){
        int sum = (n*(n+1))/2;
        int sum2 = 0;
        for (int i = 0; i < n-1; i++) {
            sum2+=arr[i];
        }
        return (sum-sum2);
    }
    static int findNumXOR(int[] arr,int N){
        int xor1 = 0;
        int xor2 = 0;
        
        for (int i = 0; i < N-1; i++) {
            xor2 = xor2^arr[i]; // XOR of array elements
            xor1 = xor1^(i+1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        return xor1^xor2;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(findNum(arr,5));
        System.out.println(findNumXOR(arr,5));
    }
}
