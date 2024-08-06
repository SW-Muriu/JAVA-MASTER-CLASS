package com.samsicker.Arrays.Challenges.SortedArray;

import java.util.Arrays;
import java.util.Scanner;

public class
SortedArray {

    public static int[] sortIntegers(int[] arr) {
        int[] sortedArray;
        sortedArray = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] < sortedArray[j]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }

        return sortedArray;
    }


    public static int[] getIntegers(int len){
        Scanner scanner = new Scanner(System.in);
        int[] myArray =  new int[len];
        int i = 0;
        for (int j=1; j <= len; j++){
            System.out.printf("Enter element %d of your integer: ", j);
            myArray[i] = scanner.nextInt();
            i++;
        }
        return myArray;
    }

    public static void printArray (int[] arr){
            for(int j = 0; j < arr.length; j++){
                    System.out.println("Element " + j + " contents " + arr[j]);
        }
    }

}
