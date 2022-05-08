// Author: Yazeed Hasan
// Purpose: Provide the calculation aspect of the QuadraticTester program
// Status: Complete
// Date: 11/10/2021
public class Quadratic {
    private double num1;
    private double num2;
    private double num3;

    public Quadratic(double coA, double coB, double coC){
        num1 = coA;
        num2 = coB;
        num3 = coC;
    }
    public boolean sols(){
        double calc;
        boolean ans = false;
        calc = (num2 * num2) - (4 * num1 * num3);
        if (calc > 0 || calc == 0){
            ans = true;
        }
        return ans;

    }
    public double solution1(){

        return ((num2 * -1) + (Math.sqrt((num2 * num2) - (4 * num1 * num3)))) / (2 * num1);
    }
    public double solution2(){

        return ((num2 * -1) - (Math.sqrt((num2 * num2) - (4 * num1 * num3)))) / (2 * num1);
    }
}
