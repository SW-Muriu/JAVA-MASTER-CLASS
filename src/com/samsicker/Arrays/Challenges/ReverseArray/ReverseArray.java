package com.samsicker.Arrays.Challenges.ReverseArray;

import java.util.Arrays;

//Write a method to reverse an array
public class ReverseArray {

    public static void main(String[] args) {

        int[] testArray = {1,2,3,4,5};

        int[] reversedArray = reverseArray(testArray);
        System.out.println(Arrays.toString(reversedArray));
    }


    private static int[] reverseArray(int[] arr){
        int[] reversedArray = new int[arr.length];
        for(int i = arr.length -1, j =0; i >= 0; i--, j++){
            reversedArray[j] = arr[i];
        }
        return reversedArray;

    }

}
