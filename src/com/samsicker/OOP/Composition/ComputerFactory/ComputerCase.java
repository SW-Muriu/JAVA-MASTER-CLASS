package com.samsicker.OOP.Composition.ComputerFactory;

public class ComputerCase extends Product{

    private  String powerSupply;
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void  pressPowerButton(){
        System.out.println("Power Button Pressed!!");
    }
}
