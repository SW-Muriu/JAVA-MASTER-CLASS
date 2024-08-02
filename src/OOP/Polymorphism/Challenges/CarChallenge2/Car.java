package OOP.Polymorphism.Challenges.CarChallenge2;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        wheels = 4;
        engine = true;
        this.cylinders = cylinders;
        this.name = name;
    }


    public String startEngine() {
        return  this.getClass().getSimpleName() + " -> engineStarted()";
    }

    public String accelerate() {
        return this.getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake() {
        return this.getClass().getSimpleName() + " -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
