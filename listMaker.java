/*
Yazeed Hasan
Date complete: 2/17/2022
Status: Complete
Purpose: Split numbers into lists
 */

import java.util.ArrayList;
import java.util.Scanner;

public class listMaker {
    public static void main(String[] args) {
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();
        ArrayList<Integer> negList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int i = 0;
        int num = 0;
        boolean check = true;
        while (check){
            System.out.print("Please input #" + (i + 1) + ": ");
            String num1 = in.next();
            try {
                num = Integer.parseInt(num1);
                if (num < 0) {
                    negList.add(num);
                } else if (num % 2 > 0) {
                    oddList.add(num);
                } else {
                    evenList.add(num);
                }
                i++;
                if (i > 11){
                    check = false;
                }
            }
            catch(Exception e){
                    System.out.println("\nInvalid input");

                }

        }
        System.out.println("The numbers in the even list are: " + evenList.toString());
        System.out.println("The numbers in the odd list are: "  + oddList.toString());
        System.out.println("The numbers in the negative list are: " + negList.toString());
        }



    }



