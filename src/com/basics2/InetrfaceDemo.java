package com.basics2;

public class InetrfaceDemo implements InterfaceClass{


    @Override
    public void studentData() {
        System.out.println("Test");
    }

    @Override
    public void detailsOfStudent() {
        System.out.println("Test");
    }

    public static void main(String[] args) {
        InetrfaceDemo i = new InetrfaceDemo();
        i.detailsOfStudent();
        i.studentData();
    }
}
