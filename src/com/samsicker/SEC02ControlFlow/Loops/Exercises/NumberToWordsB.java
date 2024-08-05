package com.samsicker.SEC02ControlFlow.Loops.Exercises;

public class NumberToWordsB {

    public static void main(String[] args) {
//        getDigitCount(0);

        int testNumber = 0;
        numberToWords(testNumber);
    }


    public static void numberToWords(int number) {

        int initialDigitCount = getDigitCount(number);
        if (initialDigitCount == -1) {
            System.out.print("Invalid Value");
        } else if (initialDigitCount == -11) {
            System.out.println("Zero");
        } else {
            if (number == 0) System.out.println("Zero");
            int reversedNumber = reverse(number);
            int reversedDigitCount = getDigitCount(reverse(reversedNumber));

            int lastDigit = reversedNumber % 10;

            String numberInWords = "";

            while (reversedNumber >= 1) {
                switch (lastDigit) {
                    case 0 -> numberInWords = " " + numberInWords + " Zero";
                    case 1 -> numberInWords = " " + numberInWords + " One";
                    case 2 -> numberInWords = " " + numberInWords + " Two";
                    case 3 -> numberInWords = " " + numberInWords + " Three";
                    case 4 -> numberInWords = " " + numberInWords + " Four";
                    case 5 -> numberInWords = " " + numberInWords + " Five";
                    case 6 -> numberInWords = " " + numberInWords + " Six";
                    case 7 -> numberInWords = " " + numberInWords + " Seven";
                    case 8 -> numberInWords = " " + numberInWords + " Eight";
                    case 9 -> numberInWords = " " + numberInWords + " Nine";
                    default -> numberInWords = "Outside Scope";
                }
                reversedNumber /= 10;
                lastDigit = reversedNumber % 10;
            }

            while (initialDigitCount > reversedDigitCount){
                numberInWords = numberInWords + " Zero";
                reversedDigitCount++;
            }
            System.out.print(numberInWords);
        }

    }


    public static int reverse(int number) {
        if (number < 1) number /= -1;

        int reversed = 0;

        while (number != 0) {
            reversed = (reversed * 10) + (number % 10);
            number /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number){
        if(number == 0) return -11;
        if (number < 1) return -1;

         int digitCount = 0;
        while (number != 0){
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }

}

