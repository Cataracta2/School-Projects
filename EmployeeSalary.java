// Author: Yazeed Hasan
// Purpose: To produce a workers weekly wage
// Status: Completed
// Date of Completion: 10/19/2021

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Input your first and last name, or input X to terminate");
        String name = in.nextLine();
        if (name.contains("x") || name.contains("X")){
            System.exit(0);
        }
        int space = name.indexOf(" ");
        String part1 = name.substring(0,1).toUpperCase(Locale.ROOT);
        String part2 = name.substring(1, space).toLowerCase(Locale.ROOT);
        String part3 = name.substring(space + 1, space + 2).toUpperCase(Locale.ROOT);
        String part4 = name.substring(space + 2, name.length()).toLowerCase(Locale.ROOT);
        name = part1 + part2 + " " + part3 + part4;



        boolean check = true;
        double salary = 0;
        while (check) {
            try {
                System.out.println("\nPlease input your hourly wage");
                salary = in.nextDouble();
                if (salary <= 0){
                    System.out.println("You either dont make any money, or are deeply in debt");
                    continue;
                }
                else{
                    check = false;
                }
            }
            catch (Exception e){
                System.out.println("That is an invalid salary input \n");
                String check2 = in.nextLine();
            }


        }


        double totalHours = 0;
        while (!check) {
            try {
                System.out.println("\nInput your total hours worked, up to a maximum of 40");
                totalHours = in.nextDouble();
                if (totalHours < 1 || totalHours > 40){
                    System.out.println("Im getting worried that someone who is employed can't read directions. Please attempt to input the requested value");
                    continue;
                }
                else{
                    check = true;
                }
            }
            catch (Exception e){
                System.out.println("That is an invalid hours input \n");
                String check2 = in.nextLine();
            }


        }


        double Overtime = 0;
        if (totalHours == 40) {
            while (check) {
                try {
                    System.out.println("\nInput any overtime hours worked, if you worked 40 flat hours, just input a 0");
                    Overtime = in.nextDouble();
                    if (Overtime < 0){
                        System.out.println("You are lucky we aren't releasing these answers to your boss. Please input a value that remotely makes sense");
                    }
                    else check = false;
                }
                catch (Exception e){
                    System.out.println("That is an invalid hours input");
                    String check2 = in.nextLine();

                }
            }
        }
        double weeklyPay = (salary * totalHours) + (Overtime * (1.5 * salary));
        String weekPay = Double.toString(weeklyPay);
        weekPay = df.format(weeklyPay);
        System.out.println("\nThe weekly pay for " + name + " is: $" + weekPay );

    }


}