
/*
Author: Yazeed Hasan
DOC: 3/21/2022
Status: Complete
Purpose: list a set of available seats
 */
import java.util.Scanner;

public class Theatre {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Initializes the set amount of seats
        int[][] seats =
                {
                        {10,10,10,10,10,10,10,10,10,10},
                        {10,10,10,10,10,10,10,10,10,10},
                        {10,10,10,10,10,10,10,10,10,10},
                        {10,10,20,20,20,20,20,20,10,10},
                        {10,10,20,20,20,20,20,20,10,10},
                        {10,10,20,20,20,20,20,20,10,10},
                        {20,20,30,30,40,40,30,30,20,20},
                        {20,30,30,40,50,50,40,30,30,20},
                        {30,40,50,50,50,50,50,50,40,30},
                };
        boolean check = true;
        boolean check2 = true;
        //Sets loop for error trapping and repeated input
        while (check) {
            System.out.println("If you would like to specify a seat, please input S. If you would like to specify a price, input P. Otherwise, input Q to quit");
            String inp = in.next();
            int column = 99;
            int row = 99;
            int price = 0;
            //Retrieves the input to access the desired seating method
            switch (inp) {
                case "s", "S" -> {
                    for (int i = 0; i < 9; i++) {
                        System.out.println(" ");
                        for (int j = 0; j < 10; j++) {
                            System.out.print(seats[i][j] + " ");
                            if (seats[i][j] == 0) {
                                System.out.print(" ");
                            }
                        }
                    }
                    while (check2) {
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("Please choose a row, the available row numbers are 1 - 9");
                        String r = in.next();
                        try {
                            row = Integer.parseInt(r);
                            if (row < 1 || row > 9) {
                                System.out.println("Not within the range");
                                System.out.println(" ");
                            } else {
                                check2 = false;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input, please try again");
                            System.out.println("________________________________");
                            System.out.println(" ");
                        }
                    }
                    while (!check2) {
                        System.out.println("Please choose a column, the available column numbers are 1 - 10");
                        String c = in.next();
                        try {
                            column = Integer.parseInt(c);
                            if (column < 1 || column > 10) {
                                System.out.println("Not within the range");

                            } else {
                                check2 = true;
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input, please try again");
                            System.out.println("________________________________");
                            System.out.println(" ");
                        }
                    }
                    row--;
                    column--;
                    if (seats[row][column] == 0) {
                        System.out.println("Unavailable seating choice");
                        System.out.println("We apologize for the inconvenience");
                        System.out.println(" ");

                    } else {
                        int tem = seats[row][column];
                        seats[row][column] = 0;
                        for (int i = 0; i < 9; i++) {
                            System.out.println(" ");
                            for (int j = 0; j < 10; j++) {
                                System.out.print(seats[i][j] + " ");
                                if (seats[i][j] == 0) {
                                    System.out.print(" ");
                                }
                            }
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("The chosen seat is in row " + (row + 1) + ", and in column " + (column + 1) + ". The price of this seat is " + tem);
                        System.out.println(" ");

                    }
                }
                case "P", "p" -> {
                    for (int i = 0; i < 9; i++) {
                        System.out.println(" ");
                        for (int j = 0; j < 10; j++) {
                            System.out.print(seats[i][j] + " ");
                            if (seats[i][j] == 0) {
                                System.out.print(" ");
                            }
                        }
                    }
                    while (check) {
                        System.out.println(" ");
                        System.out.println(" ");

                        System.out.println("Please enter the desired price for the seat. The prices are 10/20/30/40/50. The more expensive the better the seat");
                        String s = in.next();
                        try {
                            price = Integer.parseInt(s);
                            if (price == 10 || price == 20 || price == 30 || price == 40 || price == 50) {
                                check = false;
                            } else {
                                System.out.println(" ");
                                System.out.println("Not a price");
                                System.out.println(" ");
                            }
                        } catch (Exception e) {
                            System.out.println("Invalid input");
                            System.out.println(" ");
                        }
                    }
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (row < 99) {
                                break;
                            }
                            if (seats[i][j] == price) {
                                row = i;
                                column = j;
                                break;

                            }
                        }

                    }
                    if (row == 99 && column == 99) {
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("All seats for this price category are taken, we apologize for the inconvenience");
                        System.out.println(" ");
                    } else {
                        seats[row][column] = 0;
                        System.out.println(" ");
                        check = true;
                        System.out.println(" ");
                        for (int i = 0; i < 9; i++) {
                            System.out.println(" ");
                            for (int j = 0; j < 10; j++) {
                                System.out.print(seats[i][j] + " ");
                                if (seats[i][j] == 0) {
                                    System.out.print(" ");
                                }
                            }
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("The price of your seat is " + price + " in row " + (row + 1) + " and column " + (column + 1) + ". thank you for attending.");
                        System.out.println(" ");
                        System.out.println(" ");
                    }
                }
                case "Q", "q" -> {
                    System.out.println(" ");
                    System.out.println("________________________");
                    System.out.println(" ");
                    System.out.println("Goodbye!");
                    System.exit(1);
                }
                default -> {
                    System.out.println(" ");
                    System.out.println("Invalid input, please try again");
                    System.out.println(" ");
                }
            }
        }
    }
}
