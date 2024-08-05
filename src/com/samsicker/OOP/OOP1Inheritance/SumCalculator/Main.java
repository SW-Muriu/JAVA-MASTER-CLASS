package com.samsicker.OOP.OOP1Inheritance.SumCalculator;

public class Main {

    public static void main(String[] args) {
         SimpleCalculator calculator = new SimpleCalculator();

         calculator.setFirstNumber(10.7);
         calculator.setSecondNumber(34.6);

         System.out.println("The first number is: " + calculator.getFirstNumber() + " and " +
                 "the second number is: " + calculator.getSecondNumber());

         System.out.println("The addition is: " + calculator.getAdditionResult());
        System.out.println("The division is: " + calculator.getDivisionResult());
        System.out.println("The multiplication is: " + calculator.getMultiplicationResult());
        System.out.println("The subtraction is: " + calculator.getSubtractionResult());
    }
}
