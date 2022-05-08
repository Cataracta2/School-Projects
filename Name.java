// Author: Yazeed Hasan
// Purpose: Puts names in order
// Status: Complete
// Date: 11/10/2021
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input 3 names with a space or enter between them");
        String str1 = in.next();
        String str2 = in.next();
        String str3 = in.next();
        String first = "";
        String mid = "";
        String last = "";
        String[] names = {str1, str2, str3};
        for (String i: names) {
            int val1 = i.compareTo(str1);
            int val2 = i.compareTo(str2);
            int val3 = i.compareTo(str3);
            if (val1 > val2 & val1 > val3) {
                first = str1;
                if (val2 > val3) {
                    mid = str2;
                    last = str3;
                } else {
                    mid = str3;
                    last = str2;
                }
            } else if (val2 > val3 & val2 > val1) {
                first = str2;
                if (val1 > val3) {
                    mid = str1;
                    last = str3;
                } else {
                    mid = str3;
                    last = str1;
                }
            } else if (val3 > val1 & val3 > val2) {
                first = str2;
                if (val2 > val1) {
                    mid = str2;
                    last = str1;
                } else {
                    mid = str1;
                    last = str2;
                }
            }
            if (val1 == val2 & val3 > val1 ){
                first = str3;
                mid = str1;
                last = str2;
            }
            else if (val1 == val2 & val3 < val1){
                first = str1;
                mid = str2;
                last = str3;
            }
            if (val1 == val3 & val2 > val1 ){
                first = str2;
                mid = str1;
                last = str3;
            }
            else if (val1 == val3 & val2 < val1){
                first = str1;
                mid = str3;
                last = str2;
            }
            if (val2 == val3 & val1 > val2 ){
                first = str1;
                mid = str2;
                last = str3;
            }
            else if (val2 == val3 & val1 < val2){
                first = str2;
                mid = str3;
                last = str1;
            }


        }

        System.out.println("The Names in order are: ");
        System.out.println(first);
        System.out.println(mid);
        System.out.println(last);


    }
}
