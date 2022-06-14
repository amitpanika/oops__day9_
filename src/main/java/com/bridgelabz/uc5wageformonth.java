package com.bridgelabz;

public class uc5wageformonth {
    public static final int Full_Time = 2;
    public static final int Part_Time = 1;
    public static final int Num_Of_Working_Days = 2;
    int Emp_Rate_Per_Hrs = 20;
    // Variable
    int emphrs = 0;
    int empwage = 0;
    int totalEmpwage = 0;

    public static void main(String[] args) {
        uc5wageformonth uc5wageformonth = new uc5wageformonth();
        uc5wageformonth.computation();
    }

    public void computation() {
        int empcheck = (int) Math.floor(Math.random() * 10) % 3;
        for (int days = 0; days <= Num_Of_Working_Days; days++) {
            //   int empcheck = (int) Math.floor(Math.random() * 10) % 3;
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
            totalEmpwage += empwage;
        }
        System.out.println("TOTAL EMPLOYEE WAGE : " + totalEmpwage);
    }
}
