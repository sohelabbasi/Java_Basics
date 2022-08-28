package com.basics;

public class Class16 {
    public static void main(String[] args) {
        //declaring 2D array
        int [][] empId = new int [3][5];
        //adding values in first row
        empId[0][0] = 11;
        empId[0][1] = 12;
        empId[0][2] = 13;
        empId[0][3] = 14;
        empId[0][4] = 15;

        //adding value in second row
        empId[1][0] = 21;
        empId[1][1] = 22;
        empId[1][2] = 23;
        empId[1][3] = 24;
        empId[1][4] = 25;

        //adding value in third row
        empId[2][0] = 31;
        empId[2][1] = 32;
        empId[2][2] = 33;
        empId[2][3] = 34;
        empId[2][4] = 35;

        System.out.println(empId[1][1]);


    }
}
