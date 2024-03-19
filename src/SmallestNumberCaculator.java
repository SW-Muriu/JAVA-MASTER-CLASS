import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class SmallestNumberCaculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double x = in.nextDouble();
        System.out.println("Input the second number: ");
        double y = in.nextDouble();
        System.out.println("Input the third number");
        double z = in.nextDouble();

        findSmallestNumber(x,y,z);
    }

    public static double findSmallestNumber(double x, double y, double z){
        System.out.println("The smallest number is: " + Math.min(Math.min(x,y),z));
       return Math.min(Math.min(x,y),z);
    }
}

