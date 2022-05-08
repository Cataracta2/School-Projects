/*
Author: Yazeed Hasan
Purpose: Provide prime numbers from 1 to specified integer
Status: Complete
Date of Completion: 12/16/21
 */
import java.util.Scanner;

public class PrimeIt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Would you like to input an integer, or another one if you already have. (Input yes or no)");
        String check = in.nextLine();
        try {
            int check2 = Integer.parseInt(check);

            if (check2 >= 0 || check2 < 0) {
                System.out.println("Sorry that was an invalid input, sending you back to the start :)");
                System.out.println(" ");
                main(null);
            }
        } finally {


            if (check.equals("n") || check.equals("no")) {
                System.out.println("Sorry to see you go");
                System.out.println("Have a nice day!! :)");
                System.exit(0);
            }
            try {
                System.out.println("Please input the desired integer");

                int maxNumber = in.nextInt();
                System.out.println("List of the prime number between 1 - " + maxNumber);


                boolean isTrue = true;
                while (isTrue) {
                    for (int num = 2; num <= maxNumber; num++) {
                        boolean isPrime = true;
                        for (int i = 2; i <= num / 2; i++) {
                            if (num % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }

                        if (isPrime == true)
                            System.out.print(num + " ");
                    }



                    main(null);
                }
            } catch (Exception e) {
                System.out.println("Invalid input, sending you back to the start :)");
                main(null);
            }
        }
    }
}

