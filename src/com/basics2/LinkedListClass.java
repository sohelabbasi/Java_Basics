package com.basics2;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args) {
        List<String> cars = new LinkedList<>();
        cars.add("Honda");
        cars.add("Hyundai");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Porshce");

        for (String car: cars
             ) {
            System.out.println(car);
        }
    }
}
