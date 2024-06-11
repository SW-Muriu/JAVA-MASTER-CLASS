package SEC02ControlFlow.Loops.ForLoop;

public class ForLoop {
    public static void main(String[] args) {
        //Looping from 1 to 5
        for (int counter = 1; counter <= 5; counter ++){
            System.out.println("10,000 at " +counter + " interest: " + calculateInterest(10000.0, counter));
        }

        System.out.println("10,000 at 2% interest: " + calculateInterest(10000.0, 2.0));
    }


    public static double calculateInterest(double amount, double interestRate){

        return (amount * (interestRate/100));
    }

}
