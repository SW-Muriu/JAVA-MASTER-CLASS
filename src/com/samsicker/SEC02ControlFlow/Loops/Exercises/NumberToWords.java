package com.samsicker.SEC02ControlFlow.Loops.Exercises;

public class NumberToWords {

    public static void main(String[] args) {

        numberToWords(100);
    }

    private static final String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};


    public static void numberToWords(int number) {

        if (number < 1) System.out.println("Invalid Value");

        int reversed = reverse(number);
        int digitCount = getDigitCount(number);

        for (int i = 0; i < digitCount; i++) {
            int lastDigit = reversed % 10;
            reversed /= 10;

            if (i > 0 && lastDigit != 0) System.out.print(" ");

            if (digitCount > 1 && i == 1 && lastDigit > 1) {
                System.out.print(tens[lastDigit] + " ");
            } else if (((digitCount > 1) & (i > 1)) && ((reversed % 10) != 0)) {
                System.out.print(tens[lastDigit] + " ");
            } else {
                System.out.print(ones[lastDigit] + (digitCount > 1 && i == 1 && reversed % 10 == 1 ? "" : " "));
            }
        }
    }

    private static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    private static int getDigitCount(int number) {
        if (number < 0) return -1;

        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
