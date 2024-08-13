package com.samsicker.ListsIteratorsAndAutoBoxing.Challenges;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class GroceryListB {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceryItems = new ArrayList<String>();

        while (flag){
            printActions();
            switch (Integer.parseInt(scanner.nextLine())){
                case 0 -> {
                    System.out.println("Goodbye!");
                    flag = false;
                }
                case 1 -> addItems(groceryItems);
                case 2 -> removeItems(groceryItems);
                default -> flag = false;
            }

            groceryItems.sort(Comparator.naturalOrder());
            System.out.println("Grocery list: " + groceryItems);
        }
    }


    private static void printActions(){
        String textBlock = """
                0- to shutdown 
                1- to add item(s) to the list
                2- to remove an item (s) from the list""";
        System.out.println(textBlock + " ");
    }

    private static void addItems (ArrayList<String> groceries){
        System.out.println("Enter item(s) to add, separated by comma: ");
        String items = scanner.nextLine();
        for(String item : items.split(",")){
            if(item.trim().isEmpty() || groceries.contains(item.trim())) continue; // Ignore empty strings or space && duplicates
            groceries.add(item.trim());
        }
    }

    private static void removeItems(ArrayList<String> groceries){
        System.out.println("Enter item(s) to remove, separated by comma");
        String items = scanner.nextLine().trim();
        for(String item : items.split(",")){
            if(item.trim().isEmpty()) continue; // Ignore empty strings or space
            groceries.removeAll(List.of(item.trim()));
        }
    }
}
