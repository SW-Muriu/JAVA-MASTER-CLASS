package OOP1Inheritance.InheritancePrt1;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStaff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStaff(dog, "Fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStaff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer" );
        doAnimalStaff(retriever, "slow");
    }

    public static void doAnimalStaff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("__________");
    }
}
