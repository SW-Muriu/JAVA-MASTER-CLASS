package com.samsicker.Arrays.Challenges;

import java.util.Arrays;
import java.util.Random;

public class SortArrayDescending {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRandomArrayInDescendingOrder(10)));
        System.out.println((-1 > -5) ? "-1 IS BIGGER THAN -5" : "IT IS NOT BIGGER");


        int[] arr = getRandomArray(10);
        System.out.println("Not sorted " + Arrays.toString(arr));
        System.out.println("Sorted " + Arrays.toString(sortArrDesc(arr)));
    }


    //First Approach
    public static int[] getRandomArrayInDescendingOrder(int len) {
        Random random = new Random();
        int[] randomArray = new int[len];
        for (int i = 0; i < len; i++) {
            randomArray[i] = random.nextInt(-10, 0);
            randomArray[i] *= -1;
        }
        //Sort the negative values
        Arrays.sort(randomArray);
        for (int i = 0; i < len; i++) {
            randomArray[i] *= -1;
        }

        return randomArray;
    }

    //Second Approach
    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] randomArray = new int[len];
        for (int i = 0; i < len; i++) {
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }

    public static int[] sortArrDesc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}





