package com.samsicker.SEC02ControlFlow.Loops.Exercises;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {

        int testNumber = 10;
        int sumOfFirstAndLastDigit = sumFirstAndLastDigit(testNumber);
        System.out.println("The Sum of The First And Last Digit in " + testNumber + " is: " + sumOfFirstAndLastDigit);
    }

    public static int sumFirstAndLastDigit(int number){
        int sumOfFirstAndLastDigit = 0;
        int lasDigit = 0;

        //If number is negative, return -1 to mark invalidity
        if(number < 0) return -1;
        lasDigit = number % 10;
        while (number >= 10){
            number /= 10;
        }

        sumOfFirstAndLastDigit = lasDigit + number;

        return sumOfFirstAndLastDigit;
    }
}

