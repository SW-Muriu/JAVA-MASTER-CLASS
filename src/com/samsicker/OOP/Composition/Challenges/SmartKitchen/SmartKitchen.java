package com.samsicker.OOP.Composition.Challenges.SmartKitchen;

public class SmartKitchen {

    private CoffeeMaker theCoffeeMaker;
    private Refrigerator theRefrigerator;

    private DishWasher theDishWasher;


    public SmartKitchen() {
        this.theCoffeeMaker = new CoffeeMaker();
        this.theRefrigerator = new Refrigerator();
        this.theDishWasher = new DishWasher();
    }


    public void setKitchenState(boolean coffeeMakerState, boolean fridgeState, boolean dishWasherState) {
        theCoffeeMaker.setHasWorkToDo(coffeeMakerState);
        theDishWasher.setHasWorkToDo(dishWasherState);
        theRefrigerator.setHasWorkToDo(fridgeState);
    }

    public void doKitchenWork() {
       theDishWasher.doDishes();
       theRefrigerator.orderFood();
       theCoffeeMaker.brewCoffee();
    }

}
