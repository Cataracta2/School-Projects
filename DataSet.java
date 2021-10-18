public class DataSet {
    private double num1;
    private double num2;
    private double num3;
    private double num4;
    private int initialMax;
    private int initialMin;

    public DataSet(double input1, double input2, double input3, double input4) {
        num1 = input1;
        num2 = input2;
        num3 = input3;
        num4 = input4;
    }

    public double Max() {
        double max1 = Math.max(num1, num2);
        double max2 = Math.max(num3, num4);
        return Math.max(max1, max2);

    }

    public double Min() {
        double min1 = Math.min(num1, num2);
        double min2 = Math.min(num3, num4);
        return Math.min(min1, min2);
    }
    public DataSet(){
        initialMax = Integer.MAX_VALUE;
        initialMin = Integer.MIN_VALUE;
    }
}



