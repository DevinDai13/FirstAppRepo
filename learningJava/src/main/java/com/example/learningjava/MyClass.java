package com.example.learningjava;

public class MyClass {
    public static void main(String[] args) {
        // variables, if statements, type
      /*  String name = "Devin";
        int age = 19;
        boolean iAmCool = true;
        double pi = 3.14;
        //System.out.println(name);

        if(iAmCool){
            System.out.println("it was true");
            System.out.println("The age is " + age);
        }
        else{
            System.out.println("it was false");
        }
        if(age >= 18){
            System.out.println("adult");
        }
        else{
            System.out.println("minor");
        }

        */





      /*
        // Array
        String[] name = new String[]{"A", "B", "C", "D"};
        int[] num = new int[]{1, 2, 3};
        boolean[] tf = new boolean[]{true, false};
        double[] integer = new double[]{12.3, 13.4, 15,6};
        if(integer.length > 2){
            System.out.println("BIG");
        }
        else{
            System.out.println("SMALL");
        }
        */




      // Loop   same as C!
    /*
        for(int i=0; i<5; i++){
            System.out.println("1");
        }
        ///////////////////////////
        int[] numbers = new int[]{1,2,3,4,5,6,7,8};
        int sum = 0;
        for (int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
            sum += numbers[i];
        }
        System.out.println(sum);
        */





        // for Functions
        //song();



        //For class
        // object from class
        Dog puppy = new Dog();
        puppy.name = "Fido";
        puppy.age = 8;
        puppy.furColor = "white";

        puppy.dogInfo();

    }
/*
    // Functions
    public static void song(){
        System.out.println("overdose");
    }

    */


}

class Dog{
    String name = "";
    int age = 0;
    String furColor = "";
    String breed  ="";

    void dogInfo(){
        System.out.println("The dog's name is " + name + ", " + "it is " + age + " old.");
    }

}

class Poodle extends Dop{
    // extends basically copies everything from the dog class


}