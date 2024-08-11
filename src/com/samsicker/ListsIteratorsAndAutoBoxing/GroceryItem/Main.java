package com.samsicker.ListsIteratorsAndAutoBoxing.GroceryItem;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }
}

public class Main {
    public static void main(String[] args) {
        GroceryItem[] gorcerArray = new GroceryItem[3];
        gorcerArray[0] = new GroceryItem("Bread", "Bakery", 2);
        gorcerArray[1] = new GroceryItem("Milk");
        gorcerArray[2] = new GroceryItem("Eggs", "Eggs", 3);

        System.out.println(Arrays.toString(gorcerArray));


        //Array List
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Apples", "Produce", 4));
        objectList.add(new GroceryItem("Oranges", "Produce", 5));
        objectList.add ("Yoghurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Apples", "Produce", 4));
        groceryList.add(new GroceryItem("Oranges", "Produce", 5));
        groceryList.add (new GroceryItem("Yoghurt"));
    }
}
