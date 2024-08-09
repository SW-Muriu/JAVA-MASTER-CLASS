package com.samsicker.Arrays.TwoDArrays;

import java.util.Arrays;

public class TwoDArrays {

    public static void main(String[] args) {

        int[][] array = new int[3][4];

        //You can use this method as well.
        //Since the inner array can be arrays of different lengths, the size does not have to be defined

        int[] array2[] = new int[3][4];
        array2[0][0] = 4;
        array2[1][0] = 5;
        array2[2][0] = 6;
        array2[2][3] = 7;
        array2[1][1] = 8;
        array2[1][2] = 9;

        System.out.println("Array length " + array.length);

        //To print out a multidimensional array
        System.out.println("_".repeat(10) + "Method 1" + "_".repeat(10));
        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }


        //Method 2
        System.out.println("_".repeat(10) + "method 2" + "_".repeat(10));
        System.out.println(Arrays.deepToString(array2));
        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.print(array2[i][j] + " ");
                array2[i][j] = (i * 10) + (j + 1);

            }

            //Skip a line
            System.out.println();
        }


        //Method 3
        System.out.println("_".repeat(10) + "method 3" + "_".repeat(10));
        for (var outer : array2) {
            for (var el : outer) {
                System.out.print(el + " ");
            }
            System.out.println();
        }

        //Method 4
        System.out.println("_".repeat(10) + "method 4" + "_".repeat(10));
        System.out.println(Arrays.deepToString(array2));
        System.out.println();


        System.out.println("_".repeat(10) + "method 1 REDO" + "_".repeat(10));
        for(int [] outerEl: array2){
            System.out.println(Arrays.toString(outerEl));
        }


    }


}
