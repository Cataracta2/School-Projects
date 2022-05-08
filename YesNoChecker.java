// Author: Yazeed Hasan
// Purpose: To determine whether the user would like to continue on their journey
// Status: Complete
// Date: 11/10/2021
import java.util.Locale;
import java.util.Scanner;
public class YesNoChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you wish to continue on this journey?");
        String input = in.nextLine();
        input = input.toLowerCase(Locale.ROOT);
        //I wrote what you wanted and added a bit
        if (input.equals("n")){
            System.out.println("We bid you a sorrowful farewell. Program terminating...");
            System.exit(0);
        }
        else if (input.equals("y") || input.equals("yes") || input.equals("ok") || input.equals("sure") || input.equals("why not") ){
            //For this I added just a touch because I felt like why not and sure were hesitant answers
            if (input.equals("why not") || input.equals("sure")){

            System.out.println("Not a very firm answer. But OK, that is fine, let us continue");
            }
            //I wrote what you wanted and added a bit
            else System.out.println("OK! Onwards we go");
        }
        //I wrote what you wanted and added a bit
        else System.out.println("That was a bad input. Please give a clear and concise answer");
    }
}
