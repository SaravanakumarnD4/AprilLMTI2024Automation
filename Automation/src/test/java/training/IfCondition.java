package training;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = 18;



        if(a%2==0 || a%5==0){
            System.out.println("Number 3 & 5 are divisible");
        }
        else
        {
            System.out.println("Number 3 & 5 are not divisible");
        }
    }
}
