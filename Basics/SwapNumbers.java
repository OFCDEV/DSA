//No pass by reference in java, only pass by value
package Basics;

import java.util.Scanner;

public class SwapNumbers {

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();

        System.out.println("Before swapping: x = " + x + ", y = " + y);
        swap(x, y);

        System.out.println("After swapping: x = " + x + ", y = " + y);
        sc.close();
    }
}
