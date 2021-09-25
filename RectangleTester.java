
/*
Author: Yazeed Hasan
Date last modified: 9/23/2021
Purpose: To ascertain width, height, area, and perimeter of a rectangle
Status: Complete/No errors
 */

import java.awt.Rectangle;
public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(0, 0, 7, 7);
        double area = rectangle1.getWidth() * rectangle1.getHeight();
        double perimeter = (rectangle1.getWidth() * 2) + (rectangle1.getHeight() * 2);
        System.out.println("Area Value: " + area);
        System.out.println("Perimeter Value: " + perimeter);
        System.out.println("Width Value: " + rectangle1.getWidth());
        System.out.println("Height Value: " + rectangle1.getHeight());
    }



    }


