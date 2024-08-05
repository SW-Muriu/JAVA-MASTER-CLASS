package com.samsicker.SEC02ControlFlow.Loops.Exercises;

public class LastDigitChecker {

    public static void main(String[] args) {
        boolean testExample = hasSameLastDigit(9, 99, 19);
        System.out.println(testExample);
    }

    public static boolean hasSameLastDigit(int i, int j, int k) {
        boolean testNumber = isValid(i);
        if (!isValid(i) || !isValid(j) || !isValid(k)) return false;

        //Get the right most numbers
        int i_rightMostDigit = i % 10;
        int j_rightMostDigit = j % 10;
        int k_rightMostDigit = k % 10;

        boolean isIJSimilar = (i_rightMostDigit == j_rightMostDigit);
        boolean isIKSimilar = (i_rightMostDigit == k_rightMostDigit);
        boolean isJKSimilar = (j_rightMostDigit == k_rightMostDigit);

        return isIJSimilar || isIKSimilar || isJKSimilar;

    }


    public static boolean isValid (int number){
        return number >= 10 && number <= 1000;
    }
}

