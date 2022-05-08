/*
Author: Yazeed Hasan
Date of completion: 1/11/2022
Purpose: Get number of instances of target word, and index of first instance
Status: Complete
 */
import java.util.Locale;
import java.util.Scanner;
public class TargetWord {
    public static void main(String[] args) {
        System.out.println("\nPlease input in a sentence at least 30 characters long");
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        String [] words = {};
        inp = inp.toLowerCase(Locale.ROOT);
        if (inp.contains(".") || inp.contains("?") || inp.contains("!")) {
            inp = inp.substring(0, inp.length() - 1);
        }
        System.out.println(inp);
        int count = 0;
        if (inp.length() >= 30){

            System.out.println("\nPlease input the target word");
            String target = in.nextLine();
            target = target.toLowerCase(Locale.ROOT) + " ";
            words = inp.split(" ");
            for (String word : words) {

                if (target.equals(word)) {
                    count += 1;
                }

            }

            System.out.println("\nThe target word appears " + count + " times in your sentence");
            if (count > 0){
                int ind = inp.indexOf(target);
                System.out.println("The index of the first instance of the word " + target + " is: " + ind);
            }


        }

        else{
            System.out.println("That was less than 30 characters");
            main(null);
        }



    }
}
