package SEC02ControlFlow.Loops.WhileLoop;

public class ContinueConcept {

    public static void main(String[] args) {
        int number = 0;
        while (number < 50){
            number += 5;
            //Insert a continue statement, to skip processing of numbers evenly dividable by 25
            if (number % 25 == 0) continue;
            System.out.print(number + "_");
        }
    }
}
