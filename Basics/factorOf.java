package Basics;

public class factorOf {
    public static void findFactorOf(int n){

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int number = 36;
        findFactorOf(number);
    }
}
