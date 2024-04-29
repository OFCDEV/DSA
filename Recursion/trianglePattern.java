package Recursion;

public class trianglePattern {
    public static void main(String[] args) {
        triangle(5, 0);
        triangle2(5, 0);
    }
    static void triangle(int r,int c){
        if (r == 0) {
            return;
        }
        //Until column is less than row print * and increase the column count.
        if (c < r) {
            System.out.print("*");
            triangle(r, c+1);
        }
        //When r == c break the if case and print a new-line having a less num row i,e row-1
        else{
            System.out.println();
            triangle(r-1, 0);
        }
    }
    static void triangle2(int r,int c){
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r, c+1);
            System.out.print("*");
        }
        else{
            triangle2(r-1, 0);
            System.out.println();
        }
    }
}
