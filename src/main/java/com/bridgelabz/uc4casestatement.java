package com.bridgelabz;

public class uc4casestatement {
    // Constant
    public static final int Full_Time = 2;
    public static final int Part_Time = 1;
    int Emp_Rate_Per_Hrs = 20;
    // Variable
    int emphrs = 0;
    int empwage = 0;

    public static void main(String[] args) {
        uc4casestatement uc4casestatement = new uc4casestatement();
        uc4casestatement.check();
    }

    public void check() {
        int empcheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empcheck) {
            case Full_Time:
                emphrs = 8;
                break;
            case Part_Time:
                emphrs = 4;
                break;
            default:
                emphrs = 0;
        }
        empwage = Emp_Rate_Per_Hrs * emphrs;
        System.out.println("Emp_wage :" + empwage);
    }
}
