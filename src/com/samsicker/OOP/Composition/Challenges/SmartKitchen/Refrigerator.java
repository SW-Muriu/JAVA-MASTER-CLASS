package com.samsicker.OOP.Composition.Challenges.SmartKitchen;

public class Refrigerator {

    private boolean hasWorkToDo;

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Refrigerator is ordering food");
            this.hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
