package Basics;

public class reverse {
    public static void main(String[] args) {
        System.out.println(reversing(123));
    }
    static int reversing(int n){
        int rev=0;
        int num = n;
        while(num>0){
            rev = 10*rev+num%10;
            num=num/10;
        }
        return rev;
    }
}
