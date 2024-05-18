package Arrays;
import java.util.Scanner;
public class hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Initializing the array size
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //Giving values of the array
        System.out.println("Give the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //Creating a new hash array
        int[] hash = new int[13];
        for(int i:arr){
            hash[i]++;
        }
        //The program reads an integer q representing the number of queries.
        System.out.println("Enter the query size");
        int q = sc.nextInt();
        while (q-- >0) {
            int number = sc.nextInt();
            System.out.println("Number of time "+number+" appears is "+hash[number]);
        }
        sc.close();
    }
}
