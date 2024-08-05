package com.samsicker.SEC02ControlFlow.Loops.Exercises;

public class PalindromeChecker {

    public static void main(String[] args) {

        boolean palindrome = isPalindrome(-222);

    }


    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int initialNumber = number;

        if(number < 0 ){
            number = number * -1;
            initialNumber = number;
        }

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        //Now check if number is
        System.out.println("Number is: " + initialNumber + " Reversed number is: " + reversedNumber);
        System.out.println("Is " + initialNumber + " palidnromic? : " + ((initialNumber == reversedNumber) ? "Yes" : "No"));
        return initialNumber == reversedNumber;
    }
}
