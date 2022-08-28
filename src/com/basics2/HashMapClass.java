package com.basics2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Omkar");
        map.put(201, "Abhijeet");
        map.put(301, "Bharat");
        map.put(401, "Jagadeesh");
        map.put(240, "Prateek");

        Collection <String> values = map.values();
        for (String value: values
             ) {
            System.out.println(value);
        }

        Iterator<String> itr = values.iterator();
        while (itr.hasNext()){
            String value = itr.next();
            System.out.println(value);
        }
    }
}
