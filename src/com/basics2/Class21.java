package com.basics2;

public class Class21 {
   public String nameOfStudent = "ABC";
   public int ageOfStudent;
   public int studentId = 123;

   public void publicMethod(){
       System.out.println("This is my public method");
   }

   public void studentData(){
       System.out.println("The student name is: " + nameOfStudent);
   }

   public void  studentId(){
       System.out.println("The id of the student is: " + studentId);
   }

    public static void main(String[] args) {
        Class21 obj = new Class21();
        obj.publicMethod();
        obj.studentId();
        obj.studentData();

        Class23 obj2 = new Class23();
        obj2.accessIFSC();
    }


}
