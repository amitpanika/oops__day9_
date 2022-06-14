package com.bridgelabz;

public class employeewage {
    /*
         employee is present or absent....................
    */
    int Is_present = 1;
    int Is_absent = 0;

    public static void main(String[] args) {

        employeewage employeewage = new employeewage();
        employeewage.check();
    }

    public void check() {
        int empcheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empcheck == Is_present) {
            System.out.println("present");
        } else {
            System.out.println("Absent");
        }
    }
}
