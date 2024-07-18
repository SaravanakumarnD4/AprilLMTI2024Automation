package ecommerce;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class IfElseTraining {

    public static void main(String[] args) {

        int NoOfWorkingDays = 10;
        int P_Salary = 500;
        int S_Salary = 300;
        int TS_Salary = 150;

        String P = "Professor";
        String S = "Staff";
        String TS = "Training Staff";

        if (P_Salary <= 100) {
            System.out.println(P + " Salary = " + P_Salary * NoOfWorkingDays);
        } else if (S_Salary <= 299) {
            System.out.println(S + " Salary = " + S_Salary * NoOfWorkingDays);
        } else if (TS_Salary <= 200) {
            System.out.println(TS + " Salary = " + TS_Salary * NoOfWorkingDays);
        }else {
            System.out.println("No Profile");
        }
    }
}
