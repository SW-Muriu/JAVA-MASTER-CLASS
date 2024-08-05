package com.samsicker.Arrays.ArrayManipulation;

import java.util.Arrays;

public class SearchAndMatching {
    public static void main(String[] args) {
        String[] sArray = {"Abel", "Jane", "Mark", "David"};
        System.out.println(Arrays.toString(sArray));
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));

        //Binary Search
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        //Comparing Arrays
        //2 arrays are equal if they have the same elements and in the same positions
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        if(Arrays.equals(s1,s2)){
            System.out.println("The Arrays are Equal");
        } else  {
            System.out.println("The Arrays are not Equal");
        }
    }
}
