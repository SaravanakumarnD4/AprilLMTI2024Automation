package training;

import java.util.Scanner;

public class Elseif2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Tamil = scan.nextInt();
        scan.nextLine();
        int English = scan.nextInt();
        scan.nextLine();
        int Maths = scan.nextInt();
        scan.nextLine();
        int Science = scan.nextInt();
        scan.nextLine();
        int Social_Science = scan.nextInt();
        scan.nextLine();

        int Total = Tamil + English + Maths + Science + Social_Science;
        int Average = Total / 5;
        System.out.println("Total : " +Total);
        System.out.println("Average : "+Average);

        if (Average < 35) {
            System.out.println("Fail");
        } else if (Average == 35) {
            System.out.println("Pass");
        }else if (Average > 35 && Average<=100) {
            System.out.println("Topper");
        }
        else {
            System.out.println("Enter the marks");
        }

    }

}
