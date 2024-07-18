package training;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();

        int[] number = {1, 2, 3, 4, 5};
        int length = number.length;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum = sum + number[i];
        }
        System.out.println("Sum of value : " + sum);
        System.out.println("Average of value : " + sum / length);
    }

}