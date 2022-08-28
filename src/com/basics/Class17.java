package com.basics;

public class Class17 {

    String breed;
    int age;
    String color;
    String size;

    public static void main(String[] args) {
        //to create the object of the class
        Class17 obj1 = new Class17();
        obj1.breed = "golden";
        obj1.age= 9;
        obj1.color = "black";
        obj1.size = "XXL";

        System.out.println(obj1.breed);
        System.out.println(obj1.age);
        System.out.println(obj1.color);
        System.out.println(obj1.size);

        Class17 obj2 = new Class17();
        obj2.breed = "German Shepherd";
        obj2.age = 7;
        obj2.color = "Black";
        obj2.size = "Horrible";

        System.out.println(obj2.breed);
        System.out.println(obj2.age);
        System.out.println(obj2.color);
        System.out.println(obj2.size);




    }


}
