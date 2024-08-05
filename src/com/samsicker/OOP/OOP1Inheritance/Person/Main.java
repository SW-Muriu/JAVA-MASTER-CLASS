package com.samsicker.OOP.OOP1Inheritance.Person;

public class Main {
    public static void main(String[] args) {
        Person alnilam = new Person();

        alnilam.setAge(12);
        alnilam.setFirstName("Jess");
        alnilam.setLastName("M");


        System.out.println("First Name: " + alnilam.getFirstName());
        System.out.println("Last Name: " + alnilam.getLastName());
        System.out.println("Age: " + alnilam.getAge());
        System.out.println("Full Name: " + alnilam.getFullName());
        System.out.println("Teenager?: " + alnilam.isTeen());

    }
}

