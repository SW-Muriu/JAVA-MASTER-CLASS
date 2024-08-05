package OOP.MasterChallenges;

public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("coke", "drink", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Avocado", "Topping", 1.50);
//        avocado.printItem();


//        Burger burger = new Burger("regular", 4.00 );
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO" );
//        regularMeal.printItemizedList();


//        MealOrder secondMeal = new MealOrder("turkey", "7-UP", "chilli");
//        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();


        //Meal Order With  A deluxe type
        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chilli");
        deluxeMeal.addBurgerToppings("BACON", "CHEESE", "MAYO" , "Avocado", "Bacon");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList(); 

    }
}
