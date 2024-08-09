package com.samsicker.Arrays.Challenges.MinimumElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr;

        System.out.println("Enter the list of integers, delimited with a comma");
        String scannerArr = scanner.nextLine();
        System.out.println("Scanner Array: " + scannerArr);
        String[] splits = scannerArr.split(",");
        System.out.println("Splits: " + Arrays.toString(splits));
        System.out.println("Trimming challenge for element 2: " +splits[2].trim());

        //Create an empty array with zeros of length = splits.length
        inputArr = new int[splits.length];


        //Loop through the int array and parse the values to integers
        for (int i = 0; i < splits.length; i++) {
            inputArr[i] = Integer.parseInt(splits[i].trim());
        }
        return inputArr;
    }

    public static int findMin(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    //Solution 2
    public static int findMinB(int[] arr){
        int minValue = Integer.MAX_VALUE;
        for(int el: arr){
            if(el < minValue){
                minValue = el;
            }
        }
        return minValue;
    }
}
