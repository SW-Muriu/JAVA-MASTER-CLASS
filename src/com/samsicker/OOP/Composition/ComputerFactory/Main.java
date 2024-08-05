package com.samsicker.OOP.Composition.ComputerFactory;

public class Main {
    public static void main(String[] args) {
        ComputerCase theComputerCase = new ComputerCase("2208", "Dell");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 * 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theComputerCase, theMonitor, theMotherboard);


//        thePC.getMonitor().drawPixelArt(3, 5, "Blue");
//        thePC.getMotherboard().loadProgram("Windows");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}
