import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class arrsNumFind {
    public static void main(String[] args) {
        int[] arr = new int[35];

        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 35; i++) {
            int x = rand.nextInt(100) + 1400;
            arr[i] = x;

        }
        int[] arr2 = arr.clone();

        System.out.println("Array before sorting: " + Arrays.toString(arr) + "\n");
        mergeSort(arr, arr.length);
        System.out.println("Array after sorting: " + Arrays.toString(arr) + "\n\nIf you would like to choose a number to locate, input Y, otherwise input N");
        boolean bool = true;
        while (bool){

            String ans = in.next();
            if (ans.equals("Y") || ans.equals("y")){
               System.out.println("\nPlease input a number in the array above: ");
               boolean bol = true;
               while(bol){
                   String numStr = in.next();
                   if (Character.isDigit(numStr.charAt(0))){
                       int num = Integer.parseInt(numStr);
                       int count = 0;
                       int firstInd = -1;
                       for (int x = 0; x < arr2.length; x++){
                           if (arr2[x] == num){
                               count++;
                               if (firstInd<0){
                                   firstInd = x;
                               }
                           }

                       }
                       if (count > 0){
                           System.out.println("Your number was found " + count + " times, and its first appearance is at index: " + firstInd );
                       }
                       else{
                           System.out.println("Your number is not in this array");
                       }
                       System.out.println("\nIf you would like to choose another number to locate, input Y, otherwise input N");
                      break;
                   }

                   else{
                       System.out.println("Invalid input, please enter in a number");
                   }
               }
            }
            else if (ans.equals("N") || ans.equals("n")){
               System.out.println("\nHave a nice day!");
               bool = false;
            }
            else{
               System.out.println("\nInvalid input, please input Y or N");
           }
        }


    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}


