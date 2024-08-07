package com.samsicker.Arrays.Challenges.SortedArray;

import java.util.Arrays;

public class Main {
    public static void main(String... args) {
//        int[] myTestArr = getIntegers(6);
//        SortedArray.printArray(myTestArr);
//        System.out.println("Sorted Array: " + Arrays.toString(SortedArray.sortIntegers(myTestArr)));


//        Test
//        String[] testStringArr = new String[3];
//        System.out.println(Arrays.toString(testStringArr));

        System.out.println("Hello World Again");
        String[] splitString = "Hello World Again".split(" ");
        System.out.println("Split String: " + Arrays.toString(splitString));
        printText(splitString);

        System.out.println("_".repeat(30));
        printText("Hello", "World", "Again");

        System.out.println("_".repeat(30));
        printText();


        String[] sArr = {"first", "second", "third", "fourth"};
        System.out.println(String.join(",", sArr));

    }

    public static void printText(String... texList){
        for(String t: texList){
            System.out.println(t);
        }
    }
}
