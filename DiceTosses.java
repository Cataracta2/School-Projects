
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiceTosses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        do {
            int n;
            while (true) {
                try {
                    System.out.println("Please enter an integer between 10 and 30 for the amount of dice tosses.");
                    n = Integer.parseInt(s.nextLine());
                    if (n > 30 || n < 10) {
                        System.out.println("Please enter a valid number.");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter a valid number");
                }
            }

            for (int i = 0; i < n; i++) {
                arr.add((int) (Math.random() * 6 + 1));
            }
            print(arr, start(arr, longestSequence(arr)), longestSequence(arr));
            arr.clear();

            System.out.println("Please enter no if you would like to terminate the program and anything else to continue.");
        } while (!s.nextLine().equals("no"));

        System.out.println("The program is terminating");
    }

    public static int longestSequence(List<Integer> arr) {
        int largest = 0;
        int current = 1;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) != arr.get(i - 1)) {
                if (current > largest)
                    largest = current;
                current = 1;
            } else {
                current++;
            }
        }
        return Math.max(largest, current);
    }

    public static int start(List<Integer> arr, int length) {
        int c = 1;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i).equals(arr.get(i + 1))) {
                c++;
            } else {
                c = 1;
            }
            if (c == length) {
                return i - c + 2;
            }
        }
        return -1;
    }

    public static void print(List<Integer> arr, int startLong, int length) {
        String res = "";
        for (int i = 0; i < arr.size(); i++) {
            if (i == startLong) {
                res += "(";
            }
            if (i == startLong + length) {
                res = res.strip() + ") ";
            }
            res += arr.get(i) + " ";
        }
        System.out.println(res.strip());
    }
}