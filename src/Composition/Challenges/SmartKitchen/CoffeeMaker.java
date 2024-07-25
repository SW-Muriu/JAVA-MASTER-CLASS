package Composition.Challenges.SmartKitchen;

public class CoffeeMaker {

    private boolean hasWorkToDo;

    public void brewCoffee(){
        if (this.hasWorkToDo){
            System.out.println("Coffee Maker is Brewing Coffee");
            this.hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
