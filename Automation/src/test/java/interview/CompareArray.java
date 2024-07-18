package interview;

import java.util.Arrays;
import java.util.Scanner;

public class CompareArray {

    public static void main(String[] args) {

        String[] str = {"Saravana"};
        String[] str1 = {"Saravana"};

        if (Arrays.deepEquals(str, str1)) {
            System.out.println("Both the Arrays are Equal ");
        } else {
            System.out.println("Not equal");
        }
    }
}
