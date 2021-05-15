package com.all;

public class BasicMethodCallClass {

    public static void main(String[] args) {
        System.out.println("Main method start");
        methodCall();

        int varNewFan = newFan();
        System.out.println("varNewFan-->"+varNewFan);

        int varRepaireFan = repaireFan(30);
        System.out.println("varRepaireFan-->"+varRepaireFan);

        System.out.println("Main method end");
    }

    public static int repaireFan(int fanRepaire){
        System.out.println("int repaireFan");
        int number = 20;
        return fanRepaire+number;
    }

    public static int newFan(){
        System.out.println("int newFan");
        return 10+20;
    }

    public static void methodCall(){
        System.out.println("void methodCall");
    }
}
