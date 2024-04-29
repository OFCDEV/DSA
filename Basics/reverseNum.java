package Basics;
public class q2 {
    public static void main(String[] args) {
        int num= 2133;
        System.out.println(reverseNumber(num));
    }
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    
}
