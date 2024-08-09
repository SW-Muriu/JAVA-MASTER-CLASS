package com.samsicker.Arrays.Challenges.MinEl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int len = MinimumElement.readInteger();
        int[] inputArr =  MinimumElement.readElements(len);
        System.out.println(Arrays.toString(inputArr));
        int minValue =MinimumElement.findMin(inputArr);
        System.out.println("The Min Value is: " + minValue);

    }
}
