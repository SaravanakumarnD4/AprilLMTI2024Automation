package training;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExamples {

    public static void main(String[] args) {

     /*   Scanner scan = new Scanner(System.in);

        int[] Mark = new int[10];

        for (int i= 0; i<=9; i++) {
            Mark[i] = scan.nextInt();
        }

        for (int i=0;i<=9;i++){
            System.out.println(Mark[i]);
        }*/


       /* int total = Mark[0]+Mark[1]+Mark[2]+Mark[3]+Mark[4];
        int avg = total/5;
        int Percentage = (total*5/100);
        System.out.println("Total : "+total);
        System.out.println("Average : "+avg);
        System.out.println("Percentage :" +Percentage);
*/

        int arr[] = { 111, 13, 25, 9, 34, 1 };
        int a = arr.length;
        Arrays.sort(arr);

        //for (int i=0; i<=a; i++){
            System.out.println("Smallest number : "+arr[0]);
            System.out.println("Second smallest number :" +arr[1]);
      //  }

    }
}
