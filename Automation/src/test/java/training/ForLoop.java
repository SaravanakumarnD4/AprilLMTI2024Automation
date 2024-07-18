package training;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

       /* for (int i=10; i>=1; i--){
            System.out.println(i);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = scan.nextInt();
        System.out.println("Enter 2nd Number :");
        int b = scan.nextInt();

        for (int i=a; i<=b; i++){
            System.out.println(i);
        }*/

        /*for (int i =1; i<=10; i++){

            if(i%2==0){
               // System.out.println("Even Number : " +i);
            }
            else {
                System.out.println("Odd Number : "+i);
            }*/
        /*int count = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                //System.out.println("Even Numbers: " + i);
            } else {
                count = count + 1;
                //System.out.println("Odd Numbers: " + i);
            }
        }
        System.out.println("Count = "+count);*/

        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            } else {
                // System.out.println("Enter valid numbers");
            }
        }

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the value :");
        int value = scan1.nextInt();
        scan1.nextLine();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + value + " = " + i * value);
        }
    }
}

