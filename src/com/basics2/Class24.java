package com.basics2;

public class Class24 {
    String name;
    int id;

    Class24(String name, int id){
        this.name = name;
        this.id = id;
    }

    void showResult(){
        System.out.println("The name of the student is: " + name + " and id is: " + id);
    }

    public static void main(String[] args) {
        Class24 c1 = new Class24("Abhijeet", 113);
        c1.showResult();
        Class24 c2 = new Class24("prateek", 456);
        c2.showResult();
        Class24 c3 = new Class24("sharath", 789);
        c3.showResult();


    }
}
