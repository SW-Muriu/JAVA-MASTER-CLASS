package com.samsicker.SEC02ControlFlow.Loops.Exercises;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        int divisor = getGreatestCommonDivisor(609, 18);
        System.out.println(divisor);
    }

    public static int getGreatestCommonDivisor(int first, int second){

        //return -1 to indicate invalidity
        if (first < 10 || second < 10) return  -1;
        int smallerNumber = (first <= second)? first : second;
        int divisor = 1;
        int greatestDivisor = 1;

        while (divisor <= smallerNumber){
            if (first % divisor == 0 && second % divisor == 0){
                greatestDivisor = divisor;
            }
            divisor++;

        }
        return greatestDivisor;
    }

}
