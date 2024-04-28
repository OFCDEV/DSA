package Basics;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
     static boolean isPalindrome(int n){
        int rev = 0;
        int org = n;
        while(org>0){
            rev = 10*rev+org%10;
            org=org/10;
        }
        return rev == n;
    }
}
