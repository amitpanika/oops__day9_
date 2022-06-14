package com.bridgelabz;

public class uc2caldailyempwage {

    // constant
    int Is_Full_Time = 1;
    int Emp_RatePer_Hrs = 20;
    //  Variable
    int emphrs = 0;
    int empwage = 0;

    public static void main(String[] args) {
        uc2caldailyempwage uc2caldailyempwage = new uc2caldailyempwage();
        uc2caldailyempwage.check();
    }

    // Computation
    public void check() {
        int empcheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empcheck == Is_Full_Time)
            emphrs = 8;
        else
            emphrs = 0;
        empwage = Emp_RatePer_Hrs * emphrs;
        System.out.println("Emp_wage :" + empwage);
    }


}
