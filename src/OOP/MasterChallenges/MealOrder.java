package OOP.MasterChallenges;

public class MealOrder {

    private Item side;
    private Item drink;
    private Burger burger;


    public MealOrder() {
        this("regular", "coke", "fries");
    }

    //Encapsulating the information about the Item and Burger
    public MealOrder(String burgerType, String drinkType, String sideType) {

        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurger(burgerType, 8.50);
        } else {
            this.burger = new Burger(burgerType, 4.0);
        }
        this.side = new Item(sideType, "side", 1.50);
        this.drink = new Item(drinkType, "drink", 1.0);
    }

    public double getTotalPrice() {

        if (burger instanceof DeluxeBurger db) {
            return db.getAdjustedPrice();
        } else {
            return side.getAdjustedPrice() + drink.getAdjustedPrice() +
                    burger.getAdjustedPrice();
        }
    }

    public void printItemizedList() {
        burger.printItem();
        if (burger instanceof DeluxeBurger) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        } else {
            side.printItem();
            drink.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }


    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if (burger instanceof DeluxeBurger db) {
            db.addToppings(extra1, extra2,
                    extra3, extra4, extra5);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

}

