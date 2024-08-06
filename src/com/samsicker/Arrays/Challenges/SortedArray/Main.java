package com.samsicker.Arrays.Challenges.SortedArray;

import java.util.Arrays;

import static com.samsicker.Arrays.Challenges.SortedArray.SortedArray.getIntegers;

public class Main {
    public static void main(String[] args) {
        int[] myTestArr = getIntegers(6);
        SortedArray.printArray(myTestArr);
        System.out.println("Sorted Array: " + Arrays.toString(SortedArray.sortIntegers(myTestArr)));
    }
}
