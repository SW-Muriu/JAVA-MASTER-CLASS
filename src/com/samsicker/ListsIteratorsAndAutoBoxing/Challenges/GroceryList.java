package com.samsicker.ListsIteratorsAndAutoBoxing.Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryList {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> groceryItems = new ArrayList<>();

        groceryList(groceryItems);

    }



    private static void groceryList(ArrayList<String> groceryItems) {


        System.out.printf("Enter: %n 1 to shutdown, %n 2 to add item(S) to the list,  OR %n 3 to remove an item (s) from the list and 3: ");
        int choice = scanner.nextInt();
//        String prochoice = scanner.nextLine();

        if (choice == 1) {
            System.out.println("Goodbye!");
        } else if (choice == 2) {
            System.out.println("List grocery items to add (comma separated)");
            String inputItems = scanner.nextLine().trim();
            if (inputItems.isEmpty()) {
                System.out.println("No items to add.");
            }
            String[] items = inputItems.split(",");
            for (String item : items) {
                if(groceryItems.contains(item)) {
                    System.out.println("Item already exists: " + item);
                    continue;
                }
                groceryItems.add(item);
            }
            System.out.println("Grocery list: " + groceryItems);
        } else if (choice == 3) {
            System.out.println("List grocery items to remove (comma separated)");
            String inputItems = scanner.nextLine();
            String[] items = inputItems.split(",");
            for (String item : items) {
                if(groceryItems.contains(item)) {
                    groceryItems.removeAll(List.of(item));
                } else {
                    System.out.println("Item does not exist: " + item);
                }
            }
            System.out.println("Grocery list after removal: " + groceryItems);
        }
    }

}
