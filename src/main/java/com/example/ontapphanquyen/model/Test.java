package com.example.ontapphanquyen.model;

public abstract class Test {
    public static void main(String[] args) {
        Test test=new Test(){};
        System.out.println(age);
        System.out.println(test.getName());
    }
    static int age=18;



    String getName(){
         return "quanganh";
     };
      String getAge(){
          return "18";
      };
}
