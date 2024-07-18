package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] a = {1,2,3,4,5};
        int sum = 0;

        for (int i = 0; i< a.length; i++){
            sum = sum+a[i];
        }
        System.out.println("Sum : " +sum);
        System.out.println("Average : "+sum/ a.length);
    }
}
