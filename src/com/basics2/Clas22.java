package com.basics2;

public class Clas22 {

    public int zipcodeOfStudent = 452006;
    public String designation = "QA";

    public void showDesignation(){
        System.out.println("The designation of the student is: " + designation);
    }

    public void showZipcode(){
        System.out.println("The zipcode of the student is: " + zipcodeOfStudent);
    }

    public static void main(String[] args) {
        Clas22 obj =  new Clas22();
        Class21 obj2 = new Class21();

        obj.showZipcode();
        obj.showDesignation();

        obj2.studentData();
        obj2.studentId();
    }

}
