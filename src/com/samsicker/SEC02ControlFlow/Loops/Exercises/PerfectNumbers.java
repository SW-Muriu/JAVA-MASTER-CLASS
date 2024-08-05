package com.samsicker.SEC02ControlFlow.Loops.Exercises;

public class PerfectNumbers {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(10));
    }

    public static boolean isPerfectNumber(int number) {
        //Return false for negative numbers
        if (number <= 1) return false;

        int factor = 1;
        int sumOfProperFactors = 0;
        while (factor < number) {
            if (number % factor == 0) {
                sumOfProperFactors += factor;
            }
            factor++;
        }
        return sumOfProperFactors == number;
    }

}
