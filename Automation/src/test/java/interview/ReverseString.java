package interview;

import org.openqa.selenium.json.JsonOutput;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 = " ";
        char ch;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            str1 = ch + str1;
            count++;
        }
        System.out.println("Reversed word: " + str1);
        System.out.println(count);
    }
}
