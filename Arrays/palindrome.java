package Arrays;

public class palindrome {
    static boolean isPalindrome(int num){
        int rev=0;
        int x = num;
        while (x>0) {
            rev = 10*rev+x%10;
            x = x/10;
        }
        return rev == num;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}
