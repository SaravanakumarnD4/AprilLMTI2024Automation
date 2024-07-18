package interview;

import java.util.Scanner;

public class PrimeNumber1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.nextLine();
        int b = 2;

        while (a >= b) {

            if (a / 2 == 0) {
                b = b+1;
                System.out.println(a + " is not a prime number");
            } else {
                System.out.println(a + " is a prime number");
            }
            break;
        }
    }
}
