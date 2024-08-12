package com.samsicker.ListsIteratorsAndAutoBoxing.GroceryItem;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), type.toUpperCase());
    }
}

public class Main {
    public static void main(String[] args) {
        GroceryItem[] gorcerArray = new GroceryItem[3];
        gorcerArray[0] = new GroceryItem("Bread", "Bakery", 2);
        gorcerArray[1] = new GroceryItem("Milk");
        gorcerArray[2] = new GroceryItem("Eggs", "Eggs", 3);

//        System.out.println(Arrays.toString(gorcerArray));


        //Array List
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Apples", "Produce", 4));
        objectList.add(new GroceryItem("Oranges", "Produce", 5));
        objectList.add ("Yoghurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Apples", "Produce", 4));
        groceryList.add(new GroceryItem("Oranges", "Produce", 5));
        groceryList.add (new GroceryItem("Yoghurt"));


        System.out.println();
        System.out.println("Size of List" +groceryList.size());
        System.out.println(groceryList);

        //Adding an item to the beginning of the ArrayList
        groceryList.add(0, new GroceryItem("Bread", "Bakery", 2));
        System.out.println(groceryList);

        //Removing an item from the ArrayList
        groceryList.remove(1);
        System.out.println(groceryList);

        //Iterating over the ArrayList
        for(GroceryItem item : groceryList){
            System.out.println(item);
        }

        //Using a for-each loop to iterate over the ArrayList
        for(GroceryItem item : groceryList){
            System.out.println(item);
        }

        //Converting ArrayList to an Array
        GroceryItem[] groceryArray2 = groceryList.toArray(new GroceryItem[0]);
        System.out.println("Grocery List 2: " + Arrays.toString(groceryArray2));


        //Using set to replace an entry
        groceryList.set(1, new GroceryItem("Replace Item", "Groc", 3));

    }
}
