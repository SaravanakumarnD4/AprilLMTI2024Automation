package interview;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {

        System.out.println("Enter the String: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] c = str.toCharArray();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                System.out.println(c[i]);
                count++;
            }
        }
        System.out.println("No of vowels in the given string: " + count);
    }
}
