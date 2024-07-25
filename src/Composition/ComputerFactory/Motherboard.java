package Composition.ComputerFactory;

public class Motherboard extends Product{

    private int ramSlots;
    private int cardSlots;
    private String bioas;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bioas) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bioas = bioas;
    }

    public void loadProgram (String programName){
        System.out.println("Program " + programName + " is now loading ...");
    }

}
