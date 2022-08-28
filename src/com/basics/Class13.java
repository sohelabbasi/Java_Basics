package com.basics;

public class Class13 {
    public static void main(String[] args) throws InterruptedException {
        int [] studentsRollNumber = new int[10];
        //how to assign value in array
        studentsRollNumber[0] = 123;
        studentsRollNumber[1] = 234;
        studentsRollNumber[2] = 345;
        studentsRollNumber[3] = 456;
        studentsRollNumber[4] = 567;
        studentsRollNumber[5] = 678;
        studentsRollNumber[6] = 789;
        studentsRollNumber[7] = 890;
        studentsRollNumber[8] = 901;
        studentsRollNumber[9] = 123;
     //   studentsRollNumber[10] = 332;
        Thread.sleep(2000);

        System.out.println(studentsRollNumber[9]);

    }
}
