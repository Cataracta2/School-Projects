import java.util.Scanner;
public class PairTester {
    public static void main(String[] args) {
        System.out.println("Input any 2 numbers, click enter after each number");
        Scanner in = new Scanner(System.in);
        double num1 = in.nextInt();
        double num2 = in.nextInt();
        Pair answer = new Pair(num1, num2);
        System.out.println("The sum is: " + answer.getSum());
        System.out.println("The difference is: " + answer.getDiff());
        System.out.println("The product is: " + answer.getProduct());
        System.out.println("The average is: " + answer.getAverage());
        System.out.println("The distance is: " + answer.getDistance());
        System.out.println("The maximum is: " + answer.getMax());
        System.out.println("The minimum is: " + answer.getMin());
    }
}

