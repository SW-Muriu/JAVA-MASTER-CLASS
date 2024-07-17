package OOP1Inheritance.InheritancePrt1;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Matt", "Big", 50);
    }


    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type,
                weight < 15 ? "small": (weight < 35 ? "medium" : "huge"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    //Method override
    public void makeNoise(){

    }

    @Override
    public void move(String speed) {
        super.move(speed);

        //Extend functionality
        System.out.println("Dogs walk, run and wag their tails");
    }
}
