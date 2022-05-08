/*
Author: Yazeed Hasan
Purpose: Guess Game
Status: Complete
Date of completion: 12/23/2021
 */
import java.util.Random;
import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int answer = rand.nextInt(500) + 1;
        int guess = 0;
        int count = 0;
        int prevGuess = 0;
        boolean check = true;
        boolean tryCheck = true;
        String output= " ";
        // I left this in the program if you would like, I had the program print the answer so I could test my values :)
        System.out.println(answer);
        System.out.println("Would you like to start a new game of guess the number? Input y to begin, or input any other key to exit.");
        String confirm = in.nextLine();
        if (confirm.equals("y") || confirm.equals("Y")) {
            System.out.println("Alright then, lets get this started!");
        } else {
            System.exit(0);
        }

            while (check) {
                try {
                    System.out.println("\nPlace a guess");
                    guess = in.nextInt();
                    if (guess == answer) {
                        count++;
                        check = false;
                    }
                    if (guess < answer && guess <= prevGuess && count > 0 && !output.contains("high")) {
                        output = "This is a bad guess. You were already told that this value is too low";
                        System.out.println(output);
                        count++;
                    } else if (guess < answer) {
                        output = "Your guess is too low \n";
                        System.out.println(output);
                        count++;
                    }
                    if (guess > answer && guess >= prevGuess && count > 0 && !output.contains("low")) {
                        output = "This is a bad guess. You were already told that this value is too high";
                        System.out.println(output);
                        count++;
                    } else if (guess > answer) {
                        output = "Your guess is too high \n";
                        System.out.println(output);
                        count++;
                    }
                    prevGuess = guess;
                }
                catch (Exception e){
                    System.out.println("Please input only integer values \n");
                    String caught = in.nextLine();
                }
            }
            System.out.println("Congratulations!! You guessed the number in " + count + " guesses! \n");
            main(null);





        }

    }
