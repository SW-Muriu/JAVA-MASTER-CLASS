package com.samsicker.Arrays.Challenges.MinimumElementChallenge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int intAr[] = MinimumElement.readIntegers();
        System.out.println(Arrays.toString(intAr));
        MinimumElement.findMin(intAr);

        int minValue = MinimumElement.findMin(intAr);
        System.out.println("Minimum Value: " + minValue);
    }
}
