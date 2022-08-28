package com.basics;

public class Class18 {
    String empName = "Abhijeet";
    int empAge = 19;
    int empId = 123;
    String designation = "Scrum master";

    //writing method in java class
    void empInformation(){
        System.out.println("The name of the student is: " + empName);
        System.out.println("Employee is " + empAge + " years old");
        System.out.println("The employee id for this employee is: " + empId);
        System.out.println("The employee works here as " + designation);
    }

    public static void main(String[] args) {
        Class18 obj = new Class18();
        obj.empInformation();
    }


}
