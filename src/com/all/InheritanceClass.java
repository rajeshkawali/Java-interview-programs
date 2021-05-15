package com.all;

public class InheritanceClass {

    public static void main(String[] args) {
//        Parent parentRef = new Parent();
//        parentRef.test();

        Child childRef = new Child();
        childRef.test();
        int parentAmount = childRef.amount();
        System.out.println("parentAmount -->"+parentAmount);
    }
}

 class Parent{
     int varP;
     public void test(){
         System.out.println("Parent class -->void test()");
     }
     public void test(int varP){
         System.out.println("Parent class -->void test(int varP) :"+varP);
     }
     public int amount(){
         System.out.println("Parent class -->int amount()");
         return 20;
     }
 }

class Child extends Parent{
    int varC;
    public void test(){
        System.out.println("Child class -->void test()");
    }
    public void test(int varC){
        System.out.println("Child class -->void test(int varP) :"+varC);
    }
}