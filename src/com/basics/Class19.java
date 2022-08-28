package com.basics;

public class Class19 {

    public int comparison(){
        int x = 5;
        int y = 6;

        if(x<y){
            return x;
        }else{
            return y;
        }
    }

    public static void main(String[] args) {
        Class19 obj = new Class19();
        int finalValue = obj.comparison();
        System.out.println("The result is: " + finalValue );
    }


}
