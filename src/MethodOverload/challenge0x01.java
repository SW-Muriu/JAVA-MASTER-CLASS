package MethodOverload;

public class challenge0x01 {
    public static void main(String[] args) {

        System.out.println("The inches are: " + convertToCentimetres(68));
        System.out.println("The feet and inches are: " + convertToCentimetres(5, 8));

    }

    //Converts inches to centimetres
    public static double convertToCentimetres(int inches) {
        return inches * 2.54;
    }

    //Converts feet and inches to inches, then calls the first method to convert the inches to centimeters
    public static double convertToCentimetres(int feet, int inches) {
        return convertToCentimetres((feet * 12) + inches);
    }
}
