package com.basics2;

public class AbstractionDemo extends AbstractClass{

    @Override
    void study() {
        System.out.println("Students never study");
    }

    @Override
    void run() {
        System.out.println("Students always run away from the task");
    }


    public static void main(String[] args) {
        AbstractionDemo a = new AbstractionDemo();
        a.run();
        a.study();
        a.sleep();
    }
}
