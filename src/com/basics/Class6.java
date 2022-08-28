package com.basics;

public class Class6 {
    public static void main(String[] args) {
        int age = 20;
        int salary = 555555;
        int yearsOfExperience = 10;
        if(age>=18 && yearsOfExperience >=10){
            System.out.println("You are eligible for pension");
        }else{
            System.out.println("You are not eligible");
        }

        if(age == 18 || yearsOfExperience<=8 || salary==555555){
            System.out.println("Equation is correct");
        }else{
            System.out.println("Equation is not correct");
        }
    }
}
