package HelloWorld;

//Write a method isLeapYear with a parameter of type int named year.
//
//The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.
//
//Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.
public class leapYearCalculator {

    public static void main(String[] args) {
        isLeapYear(1924);
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
//            throw new RuntimeException("The year needs to be within the range 1 and 9999");
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("The year " + year + " is a leap year");
                    return true;
                }
            } else {
                System.out.println("The year " + year + " is a leap year");
                return true;
            }
        }
        System.out.println("The year " + year + " is not a leap year");
        return false;
    }
}
