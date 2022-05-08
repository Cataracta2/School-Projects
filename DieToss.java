
/*
Author: Yazeed Hasan
DOC: March 14 2022
Purpose: Find longest repeating sequence
Status: Complete
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class DieToss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<String> arr = new ArrayList<>();

        int f = 0;
        int x = 0;
        while (f < 1) {
            try {
                System.out.println("Input a number between 10 and 30 inclusive");
                String t = in.next();
                x = Integer.parseInt(t);
                if (x > 30 || x < 10) {
                    System.out.println("Invalid Input");
                    main(null);
                }

                f++;


            } catch (Exception E) {
                System.out.println("Invalid input");
                System.out.println(" ");
            }
        }

        for (int i = 0; i < x; i++) {
            arr.add(Integer.toString(rand.nextInt(6) + 1));
        }
        arr.add(" ");
        int y = arr.size();
        if (startIndex(arr) == 0 && endIndex(arr,startIndex(arr)) == 0){
            System.out.println("Longest string found was 1 character long");
            arr.add(0,"(");
            arr.add(2,")");
        }
        else {
            for (int i = 0; i < y; i++) {
                if (i == startIndex(arr)) {
                    arr.add(i, "(");
                    i++;
                } else if (i == endIndex(arr, startIndex(arr))) {
                    arr.add(i + 1, ")");
                    i++;
                }

            }
        }
        System.out.println(" ");
        System.out.println("Longest string found was " + (endIndex(arr, startIndex(arr)) -startIndex(arr)+1) + " characters long");
        for (String s : arr) {
            System.out.print((s + " "));
        }
        System.out.println(" ");
        System.out.println("If you would like to try again, input Y, otherwise input anything else to quit");
        String input = in.next();
        if (input.equals("Y") || input.equals("y")){
            System.out.println(" ");
            System.out.println("__________________________________");
            System.out.println(" ");
            main(null);
        }
        else{
            System.exit(1);
        }

    }
    public static int startIndex(ArrayList<String> arr){
        int count = 0;
        int count2 = 0;
        int temp = 0;
        int temp2 = 0;
        int ans = 0;
        boolean stage2 = false;
        boolean check = false;
        for (int i = 0; i < arr.size(); i++){
            if (i == arr.size() - 1){

            }
            else{
                if (arr.get(i).equals(arr.get(i+1)) && !check){
                    if (!stage2){
                        count++;
                        temp = i;
                    }
                    else{
                        count2++;
                        temp2 = i;
                    }

                    check = true;
                }
                else if (arr.get(i).equals(arr.get(i+1))){
                    if (!stage2){
                        count++;
                    }
                    else{
                        count2++;
                    }
                    }
                else{
                    check = false;
                    if (count2 == 0){
                        stage2 = true;
                    }
                    else{
                        if (count > count2){
                            ans = temp;
                        }
                        else{
                            ans = temp2;
                        }
                        count = 0;
                        count2 = 0;
                    }

                }

            }
        }
        return Math.max(count,ans);
    }
    public static int endIndex(ArrayList<String> array, int a){
        int end = 0;
        boolean check = true;
        for (int i = a; i < array.size(); i++){
            if (i == array.size()-1){

            }
            else if (!(array.get(i).equals(array.get(i+1)))){
                break;
            }
            end++;
        }
        return end + a;
    }

}