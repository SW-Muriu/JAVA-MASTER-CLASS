package OOP1Inheritance.InheritancePrt1.Animalia;

public class Fish extends Animal{

    private  int fins;
    private int gills;


    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    public Fish(int fins, int gills) {
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles(){
            System.out.print("Muscles Moving ");
    }

    private void moveBackFins(){
        System.out.print("Back fin Moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();

        if(speed == "fast") {
            moveBackFins();
        }

        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
