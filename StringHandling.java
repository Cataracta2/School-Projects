import java.util.Scanner;
public class StringHandling {
    public static void main(String[] args) {
        System.out.println("Input any word or sentence, press enter afterwards");
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        Boolean ifFound = input1.indexOf("th");
        String thirdSpace = input1.substring(input1.indexOf(" ") + 1);
        thirdSpace = thirdSpace.substring(thirdSpace.indexOf(" ") + 1);
        thirdSpace = thirdSpace.substring(thirdSpace.indexOf(" ") + 1);
        System.out.println("_____________________________________________");
        System.out.println("Your Original Sentence: " + input1);
        System.out.println("String Length: " + input1.length());
        System.out.println("First index of a space: " + input1.indexOf(" "));
        System.out.println("The sentence after the third space and the sentence after the 12th index: " + thirdSpace + " \\" + input1.substring(12));
        System.out.println("The chars at indexes 5, 9, and 12: " + input1.charAt(5) + ", " + input1.charAt(9) + ", " + input1.charAt(12));


    }
}
