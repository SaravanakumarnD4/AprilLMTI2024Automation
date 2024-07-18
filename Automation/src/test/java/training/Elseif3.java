package training;

import java.util.Scanner;

public class Elseif3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String trafficlight = scan.nextLine();

        if (trafficlight.equalsIgnoreCase("red")) {
            System.out.println("Stop");
        } else if (trafficlight.equalsIgnoreCase("yellow")) {
            System.out.println("Get Ready");

        } else if (trafficlight.equalsIgnoreCase("green")) {
            System.out.println("Go");
        }else {
            System.out.println("Enter valid Traffic Signal");
        }
    }
}
