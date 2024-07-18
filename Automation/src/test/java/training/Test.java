package training;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int a = 12345;
        String str = String.valueOf(a);
        System.out.println(str);

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        Double score = scan.nextDouble();
        scan.nextLine();
        String dept = scan.nextLine();
        System.out.println("My Name is "+name);
        System.out.println("My Score is " +score/10 +"/10");
        System.out.println("My Department is "+dept);


    }
}
