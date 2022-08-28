package com.basics2;

public class DerivedClass extends BaseClass{

    public String department = "QA";
    public String employeeStatus = "Not sure";


    public static void main(String[] args) {
        DerivedClass d = new DerivedClass();
        System.out.println("The name of the employee is: " + d.name);
        System.out.println(d.department);
        System.out.println(d.employeeStatus);
        System.out.println(d.designation);
        System.out.println(d.salary);
    }



}
