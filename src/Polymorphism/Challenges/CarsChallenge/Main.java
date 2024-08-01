package Polymorphism.Challenges.CarsChallenge;

public class Main {
    public static void main(String[] args) {
        Car theCar = new Car("2022 Blue Ferrari 296 GTS");
        runRace(theCar);

        Car theFerrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",
                15.4, 6);
        runRace(theFerrari);
    }

    public static void  runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
