package com.samsicker.ListsIteratorsAndAutoBoxing.MoreLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {

        String[] items = {
                "Apples",
                "Oranges",
                "Bananas",
                "Eggs"
        };


        List<String> list = List.of(items);
//        list.add("Yoghurt");

//        System.out.println("Adding to an immutable list" + list);

        System.out.println(list.getClass().getName());

        ArrayList<String> groceries = new ArrayList<String>(list);
        groceries.add("Yoghurt");
        System.out.println("Mutable Array List: " + groceries);


        //Adding a new list
        ArrayList<String> groceries2 = new ArrayList<>(List.of("Apples", "Test2", "AA"));
        groceries2.add("Yogurt");
        System.out.println("Creating an arrayList using a list: " + groceries2);

        System.out.println();

        System.out.println("_".repeat(10) + " Method next" + "_".repeat(10));


        groceries.addAll(groceries2);
        System.out.println("Using add all method: " + groceries);

        System.out.println();

        groceries.sort(Comparator.naturalOrder());
        System.out.println("Sorting the list: " + groceries);

        System.out.println();

        groceries.sort(Comparator.reverseOrder());
        System.out.println("Sorting the list in reverse order: " + groceries);

        //Overloaded method: Getting a list from an array
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println("XX: " + Arrays.toString(groceryArray));

        ArrayList<String> immutableList = new ArrayList<String>(List.of("firstName", "secondName"));
        immutableList.add("ThirdName");
        System.out.println("Immutable List: " + immutableList);


        ArrayList<ArrayList<String>> multiDList = new ArrayList<ArrayList<String>>();
        System.out.println(multiDList);



        //Used in creating a fixed size list, where you want an array with list methods
        System.out.println("_".repeat(10) + " Method next" + "_".repeat(10));
        String[] testArray = {"First", "second", "Third"};
        var testList = Arrays.asList(testArray);


        testList.set(0, "Jesus");
        System.out.println("Array List: " + testList);
        System.out.println("Original Array: " + Arrays.toString(testArray));

        var listOne = List.of("Sunday", "Monday", "Tuesday");
//        listOne.add("Friday");   //Not operational since the list is immutable
        listOne.set(0, "Saturday");
        System.out.println("Immutable List: " + listOne);


    }


}