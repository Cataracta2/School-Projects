public class Pair {
    private double num1;
    private double num2;


    public Pair(double input1, double input2){
        num1 = input1;
        num2 = input2;
    }
    public double getSum(){
        return num1 + num2;

    }
    public double getDiff(){
        return num1 - num2;
    }
    public double getProduct(){
        return num1 * num2;
    }
    public double getAverage(){
        return (num1 + num2)/2;
    }
    public double getDistance(){
        return Math.abs(num1 - num2);
    }
    public double getMax(){
        return Math.max(num1,num2);
    }
    public double getMin(){
        return Math.min(num1,num2);
    }

}
