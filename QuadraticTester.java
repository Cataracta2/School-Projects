// Author: Yazeed Hasan
// Purpose: Execute the operations in the Quadratic class to calculate the real solutions of the inputted values
// Status: Complete
// Date: 11/10/2021
import java.util.Scanner;
public class QuadraticTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the A coefficient");
        Double coA = in.nextDouble();
        System.out.println("Input the B coefficient");
        Double coB = in.nextDouble();
        System.out.println("Input the C coefficient");
        Double coC = in.nextDouble();
        Quadratic answer = new Quadratic(coA, coB, coC);
        if (!answer.sols()) System.out.println("Your inputted values do not compute to a real number.");
        if (answer.sols()){
            System.out.println("The Solutions for the inputted values are: " + " " + "( " + answer.solution1() + ", " + answer.solution2() + " )");
        }

    }
}
