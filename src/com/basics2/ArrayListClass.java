package com.basics2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

    public static void main(String[] args) {
        //creating array list
        //List<Integer> li = new ArrayList<>();
        ArrayList<Integer> li =  new ArrayList<>();
        li.add(5); // it will add the value at 0 index position
        li.add(7);
        li.add(9);
        li.add(11);
        li.add(13);
        li.add(15);

        //to identify the size of the list
        int count = li.size();
        System.out.println(count);
        System.out.println("The values of the list are: " + li);

        //add another element
        li.add(5, 19);
        System.out.println(li);

        li.remove(6);
        System.out.println(li);

    }

}
