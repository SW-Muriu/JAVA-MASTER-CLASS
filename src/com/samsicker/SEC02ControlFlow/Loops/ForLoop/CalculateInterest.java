package com.samsicker.SEC02ControlFlow.Loops.ForLoop;

public class CalculateInterest {
    public static void main(String[] args) {

        for(double rate = 7.5; rate <= 10.0; rate  +=  0.25){
            double interestAmount = calculateInterest(10000.0, rate);
            if(interestAmount > 850.0){
                break;
            }
            System.out.println("The interest of 10,000 at rate " + rate + " is " + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double rate){
        return (amount * (rate/100));
    }
}
