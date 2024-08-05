package com.samsicker.OOP.OOP1Inheritance.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Porsche ");
        car.setColor("Black");
        car.setModel("Carrera");
        car.setConvertible(true);
        car.setDoors(2);

        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche ");
        targa.setColor("Red");
        targa.setModel("Targa");
        targa.setConvertible(false);
        targa.setDoors(2);

        targa.describeCar();

    }
}
