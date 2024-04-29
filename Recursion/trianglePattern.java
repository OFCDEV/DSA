package Recursion;

public class trianglePattern {
    static void triangle(int r,int c){
        if (r == 0) {
            return;
        }
        //Until column is less than row print * and increase the column count.
        if (c < r) {
            System.out.println("*");
            triangle(r, c+1);
        }
        //When r == c break the if case and print a new-line having a less num row i,e row-1
        else{
            System.out.println();
            triangle(r-1, c);
        }
    }
}
