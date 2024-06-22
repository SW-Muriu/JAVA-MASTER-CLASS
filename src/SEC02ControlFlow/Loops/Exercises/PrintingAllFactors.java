package SEC02ControlFlow.Loops.Exercises;

public class PrintingAllFactors {

    public static void main(String[] args) {
        printFactors(42);
    }

    public static void printFactors(int number){
        if (number < 1 ) System.out.println("Invalid Value");

        int factor = 0;
        int divider = 1;
        String output = "";

        while (divider <= number) {
            if (number % divider ==0) {
                factor = divider;
                output = ( output + factor + "\n");
            }
            divider++;
        }

        System.out.println(output);
    }
}
