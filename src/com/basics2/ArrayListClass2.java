package com.basics2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("abc");
        names.add("xyz");
        names.add("cde");
        names.add("cvb");
        names.add("mvp");

        //using advance for loop or for each loop
        for (String name:names) {
            System.out.println(name);
        }

        //using for loop
        for (int count = 0; count<names.size(); count++){
            System.out.println(names.get(count));
        }

        //using iterator
        Iterator itr = names.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
