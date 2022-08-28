package com.basics2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapClass {
    public static void main(String[] args) {
        //declare map
        Map<Integer, String> map = new TreeMap<>();
        //adding the element in the map

        map.put(001, "Hyundai");
        map.put(002, "Honda");
        map.put(003, "BMW");
        map.put(004, "Audi");
        map.put(005, "Kia");

        //to display the map values
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry<Integer, String> singleEntry = itr.next();
            //to print all the keys
            System.out.println(singleEntry.getKey());
            //to print all the values
            System.out.println(singleEntry.getValue());
            System.out.println("The key is: " + singleEntry.getKey() + " and the value is: "
            + singleEntry.getValue());
        }
    }
}
