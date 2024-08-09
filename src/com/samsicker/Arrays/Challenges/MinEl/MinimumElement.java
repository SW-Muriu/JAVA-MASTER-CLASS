package com.samsicker.Arrays.Challenges.MinEl;

import java.util.Scanner;

public class MinimumElement {


    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of your array");
        return scanner.nextInt();
    }

    public static int[] readElementsB(int len) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input %d integers separated by comma", len);
        String inputStr = scanner.nextLine();
        String[] splits = inputStr.split(",");
        int[] finalArr = new int[len];
        for (int i = 0; i < len; i++) {
            finalArr[i] = Integer.parseInt(splits[i]);
        }
        return finalArr;
    }


    public static int findMin(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        for (int el : arr) {
            if (el < minValue) {
                minValue = el;
            }
        }
        return minValue;
    }

    public static int[] readElements(int len){
        Scanner scanner = new Scanner(System.in);
        int[] intArr = new int[len];
        for(int i = 0; i < len; i++){
            System.out.println("Enter a number");
            intArr[i] = scanner.nextInt();
        }

        return intArr;
    }
}
