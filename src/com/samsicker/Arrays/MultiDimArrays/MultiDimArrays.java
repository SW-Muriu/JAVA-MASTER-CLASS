package com.samsicker.Arrays.MultiDimArrays;

import java.util.Arrays;

public class MultiDimArrays {


    public static void main(String[] args) {
        int[][][][] multiDArrays = new int[3][2][3][3];


        System.out.println(Arrays.deepToString(multiDArrays));


        for (var outer1el : multiDArrays) {
            for (var outer2el : outer1el) {
                for(var outer3el: outer2el){
                    int j = 2;
                    for (int i = 0; i < outer3el.length; i++){
                        outer3el[i] = j;
                        j++;
                    }
                    System.out.println(Arrays.toString(outer3el));
                }
            }
        }


        Object [] anyArray = new Object[3];

        anyArray[0] = new String[]{"a","b", "c"};
//        anyArray[1] = new String[]{"d","e", "f"};

        anyArray[1] = new String[][]{
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));


        anyArray[2] = new int[2][2][2];
        System.out.println();
        System.out.println(Arrays.deepToString(anyArray));
        System.out.println();



        //Printing them out
        for(Object element: anyArray){
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }
}

