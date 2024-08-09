package com.samsicker.Arrays.Challenges.ReverseArray;

import java.util.Arrays;

public class ReverseArray2 {

    public static void main(String[] args) {

        int testArray[] = {1, 2, 3, 4, 5};
        reverseB(testArray);

    }

    private static void reverse(int[] arr) {
        System.out.println("Array = " + Arrays.toString(arr));
        int[] reversedCopy = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedCopy[j] = arr[i];
        }
        System.out.println("Reversed array = " + Arrays.toString(reversedCopy));

    }


    //Reverse B
    private static void reverseB(int[] arr) {
        System.out.println("Array = " + Arrays.toString(arr));

        int maxIndex = arr.length - 1;
        int halfLength = arr.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = arr[i];
            arr[i] = arr[maxIndex - i];
            arr[maxIndex - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(arr));
    }
}
