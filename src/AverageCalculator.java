import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double a = in.nextDouble();
        System.out.println("Input the second number: ");
        double b = in.nextDouble();
        System.out.println("Input the third number: ");
        double c = in.nextDouble();
        calculateAverage(a,b,c);
    }

    public static double calculateAverage(double a, double b, double c){
        double average = ( a + b + c)/3;
        System.out.println("The average of the three numbers is:  " + average);
        return average;
    }
}
