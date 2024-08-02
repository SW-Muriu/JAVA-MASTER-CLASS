package OOP.Polymorphism.Challenges.CarsChallenge;

public class Main {
    public static void main(String[] args) {
        Car theCar = new Car("2022 Blue Ferrari 296 GTS");
        runRace(theCar);

        Car theFerrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",
                15.4, 6);
        runRace(theFerrari);

        Car tesla = new ElectricCar("2022 Red Tesla Model 3",
                6, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("Black Ferrari SF90 Stradale",
                16, 8, 8);
        runRace(ferrariHybrid);

    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
