package com.basics2;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setEmpName("Mike");
        e.setAge(29);
        System.out.println(e.getAge());
        System.out.println(e.getEmpName());
    }
}
