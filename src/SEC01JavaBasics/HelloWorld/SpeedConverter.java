package SEC01JavaBasics.HelloWorld;

public class SpeedConverter {
    public static void main(String[] args) {
         printConversion(1);
    }

    public static long toMilesPerHour(double kilometersPerHour){

        //Math.round rounds down the value to a whole number
        //If the kph is less than 0 -1 is returned representing an invalid value
        long result = (kilometersPerHour<0)? -1 : Math.round(kilometersPerHour/1.609344);

        return result;
    }

    public static void printConversion(double kilometersPerHour){

        System.out.println((toMilesPerHour(kilometersPerHour) == -1? "Invalid Value " : (kilometersPerHour +
                " km/h = " +
                toMilesPerHour(kilometersPerHour) +
                " mi/h")));
    }
}
