package Strings;
import java.util.Scanner;
public class hikerProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the path sequence: (U for Up,D for down)");
        String hikePath = sc.nextLine();

        int valleys = 0;
        int elevation = 0; //Starts at sea-level

        for (int i = 0; i < hikePath.length(); i++) {
            char step = hikePath.charAt(i);

            if (step == 'U') {
                elevation++;
            }else if (step == 'D') {
                elevation--;
            }
            //If we just came up to sea level from below,it's the end of a valley(Foot of the valley)
            if (elevation == 0 && step =='U') {
                valleys++;
            }
        }
        System.out.println("Number of Valleys: "+valleys);
        sc.close();
    }
}
