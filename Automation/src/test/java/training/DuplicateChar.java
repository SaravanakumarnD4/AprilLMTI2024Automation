package training;

import java.util.Scanner;

public class DuplicateChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] c = str.toCharArray();
        int count =0;
        System.out.println(c);

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (c[i] == c[j]) {
                    System.out.print(c[j] +" ");
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
