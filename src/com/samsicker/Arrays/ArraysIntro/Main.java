package com.samsicker.Arrays.ArraysIntro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        myDoubleArray[5] = 6;

        System.out.println(myDoubleArray[5]);

        int[] firstFivePositives = new int[]{1, 2, 3, 4, 5};
        //We can also drop the instantiation and use the anonymous array initializer

        int[] secondFivePositives = {6, 7, 8, 9, 10};


        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("First = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array: " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);
        int[] newArray = new int[6];

//        for (int i = 0; i < newArray.length; i++) {
//            newArray[i] = newArray.length - i;
//        }

        int j = 0;
        while (j < newArray.length) {
            newArray[j] = newArray.length -j;
            j ++;
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        //Enhanced For Loop
        for (int element: newArray){
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(newArray));



        //You can assign an array to an object reference eg:

//        Object objectVariable = newArray;

        if(newArray instanceof  int[]){
            System.out.println("ObjectVariable is really an int array");
        }


        //Using objects within arrays

        Object[] objectsArray = new Object[4];
        objectsArray[0] = "Hello";
        objectsArray[1] = new StringBuilder("World");
        objectsArray[2] = 45;
        objectsArray[3]  = Arrays.toString(newArray);

        System.out.printf(Arrays.toString(objectsArray));

    }
}
