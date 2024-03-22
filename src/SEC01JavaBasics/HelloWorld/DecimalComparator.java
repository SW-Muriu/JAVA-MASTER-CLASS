package SEC01JavaBasics.HelloWorld;//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//The method should return boolean and it needs to return true
// if two double numbers are the same up to three decimal places. Otherwise, return false.

public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlacesb(-3.1756,-3.175);
        System.out.println("MyMethod:: ln");
        areEqualByThreeDecimalPlaces(-3.1756,-3.175);

    }

    //Truncates
    public static boolean areEqualByThreeDecimalPlaces(double firstDecimalNumber, double secondDecimalNumber) {
        long multiplier = (long) Math.pow(10, 3);
        double formattedFirstDecimalNumber = Math.floor(firstDecimalNumber * multiplier) / multiplier;
        System.out.println("formattedFirstDecimalNumber: " + formattedFirstDecimalNumber);
        double formattedSecondDecimalNumber = Math.floor(secondDecimalNumber * multiplier) / multiplier;
        System.out.println("formattedSecondDecimalNumber: " + formattedSecondDecimalNumber);


        System.out.println(formattedFirstDecimalNumber == formattedSecondDecimalNumber ? firstDecimalNumber + " and " + secondDecimalNumber + " are equal to the third decimal place" :
                firstDecimalNumber + " and " + secondDecimalNumber + " are not equal to the third decimal place");

        return formattedFirstDecimalNumber == formattedSecondDecimalNumber;
    }


    //Rounds off
    public static boolean areEqualByThreeDecimalPlacesb(double first, double second) {

        long firstRounded = (long) (first * 1000);
        System.out.println("firstRounded: " + firstRounded);
        long secondRounded = (long) (second * 1000);
        System.out.println("secondRounded: " + secondRounded);

        System.out.println(  (firstRounded == secondRounded) ?
                first + " and " + second + " are equal to the third decimal place" :
                first + " and " + second + " are not equal to the third decimal place");

        return firstRounded == secondRounded;
    }

}

