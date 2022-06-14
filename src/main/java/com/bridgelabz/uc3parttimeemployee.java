package com.bridgelabz;

public class uc3parttimeemployee {
    // Constant
    int Full_Time = 2;
    int Part_Time = 1;
    int Emp_Rate_Per_Hrs = 20;
    // Variable
    int emphrs = 0;
    int empwage = 0;

    public static void main(String[] args) {
        uc3parttimeemployee uc3parttimeemployee = new uc3parttimeemployee();
        uc3parttimeemployee.check();


    }

    public void check() {
        int empcheck = (int) Math.floor(Math.random() * 10) % 3;
        if (empcheck == Full_Time)
            emphrs = 8;
        else if
        (empcheck == Part_Time)
            emphrs = 4;
        else
            emphrs = 0;
        empwage = Emp_Rate_Per_Hrs * emphrs;
        System.out.println("Emp_wage :" + empwage);
    }
}
