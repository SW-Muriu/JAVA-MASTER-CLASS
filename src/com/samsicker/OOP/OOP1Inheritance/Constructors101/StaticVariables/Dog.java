package com.samsicker.OOP.OOP1Inheritance.Constructors101.StaticVariables;

 class Dog {
     private static String name;

     public  Dog(String name){
         Dog.name = name;
     }

     public void printName(){
         System.out.println("name = " + Dog.name);
     }
}

