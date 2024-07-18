package ecommerce;

import org.openqa.selenium.json.JsonOutput;

import java.util.Scanner;

public class RS {

    public static void main(String[] args) {

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
        System.out.println(count);


    }
}
