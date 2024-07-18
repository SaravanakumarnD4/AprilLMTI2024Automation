package interview;

import java.util.Scanner;

public class OddNumber {

    public static void main(String[] args) {

        int[] a = {11, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 15};
        int count = 0;


        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                count++;
                System.out.println("Odd Number is : " + a[i]);
            }
        }
        System.out.println("Total Odd Numbers are : " + count);
    }
}
