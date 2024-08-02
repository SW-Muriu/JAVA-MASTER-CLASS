package OOP.Composition.Challenges.SmartKitchen;

public class SmartKitchenApplication {
    public static void main(String[] args) {
        SmartKitchen theKitchen = new SmartKitchen();

        theKitchen.setKitchenState(true, false, true);

//        theKitchen.getTheDishWasher().doDishes();
//        theKitchen.getTheCoffeeMaker().brewCoffee();
//        theKitchen.getTheRefrigerator().orderFood();

        theKitchen.doKitchenWork();
    }
}
