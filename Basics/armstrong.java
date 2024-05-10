package Basics;

// import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        //User input
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter to check armstrong or not: ");
    //     int n = sc.nextInt();
    //     System.out.println(isArmstrong(n));
    //     sc.close();
        //print all 3 digit armstrong
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean isArmstrong(int n){
        int sum=0;
        int org =n;
        while(n>0){
            int rem = n%10;
            n/=10;
            sum = sum + rem*rem*rem;
        }
        return sum == org;
    }

}
