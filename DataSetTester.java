import java.util.Scanner;
public class DataSetTester {
    public static void main(String[] args) {
        System.out.println("Input any 4 numbers, after each number click enter");
        Scanner in = new Scanner(System.in);
        double num1 = in.nextInt();
        double num2 = in.nextInt();
        double num3 = in.nextInt();
        double num4 = in.nextInt();
        double Max;
        double Min;
        DataSet answer = new DataSet(num1, num2, num3, num4);
        Max = answer.InitialMax();
        Min = answer.InitialMin();
        Max = answer.Max();
        Min = answer.Min();
        System.out.println(Max);
        System.out.println(Min);



    }
}
