// Author: Yazeed Hasan
// Purpose: Provide the numerical value for inputted grade
// Status: Complete
// Date: 11/10/2021

import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        System.out.println("Please input the grade you wish to convert");
        Grade answer = new Grade();
        System.out.println("The numeric grade: " + answer.getLetterGrade());
    }
    public double getLetterGrade(){
        Scanner in = new Scanner(System.in);
        double gpa = 0;
        String input = in.nextLine();
        if (input.contains("A") || input.contains("a")){
            gpa = 4;
        }
        if (input.contains("B") || input.contains("b")){
            gpa = 3;
        }
        if (input.contains("C") || input.contains("c")){
            gpa = 2;
        }
        if (input.contains("D") || input.contains("d")){
            gpa = 1;
        }
        if (input.contains("F") || input.contains("f")){
            gpa = 0;
        }
        if (input.contains("+")){
            gpa += .3;
        }
        if (input.contains("-")){
            gpa -= .3;
        }
        if (input.equals("A+") || input.equals("a+")){
            gpa = 4.0;
        }
        if (input.equals("F-") || input.equals("F+")){
            gpa = 0;
        }

        return gpa;
    }

}
