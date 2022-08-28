package com.basics;

import com.basics2.Class21;
import com.basics2.Class23;

public class Class20 {
    public int comparisonWithParameters(int x, int y){
        if(x<y){
            return x;
        }else{
            return y;
        }
    }

    public static void main(String[] args) {
        Class20 obj = new Class20();
        int output = obj.comparisonWithParameters(7, 8);
        System.out.println("output = " + output);

        Class20 obj2 = new Class20();
        int output2 = obj2.comparisonWithParameters(9, 10);
        System.out.println("output = " + output2);

        Class21 c = new Class21();
        c.studentId();


        Class23 c23 = new Class23();


    }

}
