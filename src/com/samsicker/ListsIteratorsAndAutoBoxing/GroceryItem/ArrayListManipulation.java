package com.samsicker.ListsIteratorsAndAutoBoxing.GroceryItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListManipulation {
    public static void main(String[] args) {

        ArrayList<String> groceries = new ArrayList<>(List.of(
                "Yogurt",
                "Apples",
                "Oranges",
                "Mangoes"
        ));

        //We use get to get Items in an array list
        //Indexing matches array indexing
        System.out.println("Third Item:  " + groceries.get(2));

        System.out.println();

        if (groceries.contains("Apples")) {
            System.out.println("The list contains Apples");
        }

        System.out.println();

        groceries.add("Yogurt");
        System.out.println("First = " + groceries.indexOf("Yogurt"));
        System.out.println("Last = " + groceries.lastIndexOf("Yogurt"));

        //Removing Elements
        System.out.println();

        System.out.println("Groceries with Apples: " + groceries);
        System.out.println("Index of Apples " + groceries.indexOf("Apples"));
        //Removes the first instance of Apples
        groceries.remove("Apples");
        System.out.println("Groceries without Apples: " + groceries);
        groceries.add(1, "Apples");
        System.out.println("Groceries with apples added: " + groceries);

        System.out.println();

        //You can remove all instances of an element using removeAll
        groceries.removeAll(List.of("Yogurt"));
        System.out.println("Groceries without Apples: " + groceries);

        //We can also remove all but a list of what we want to remain

        System.out.println();

        groceries.retainAll(List.of("Mangoes"));
        System.out.println("Retain Mangoes: " + groceries);

        //Add items for other operations
        groceries.addAll(List.of("Apples", "Milk", "Mustard", "Cheese"));
        groceries.addAll(Arrays.asList("Egg", "Pickles", "Mustard", "Ham"));
        System.out.println("Groceries: " + groceries);
        System.out.println();

        //Sorting
        groceries.sort(Comparator.naturalOrder());
        System.out.println();



    }
}
