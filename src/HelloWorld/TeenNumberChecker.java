package HelloWorld;
//We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
//Write a method named hasTeen with 3 parameters of type int.
//The method should return boolean and it needs to return true if one
// of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
//Write another method named isTeen with 1 parameter of type int.
//The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.


public class TeenNumberChecker {
    public static void main(String[] args) {
        CommonParamsInput commonParamsInput = new CommonParamsInput();
        int[] inputIntegers = commonParamsInput.variablesInput();

        hasTeen(inputIntegers[0], inputIntegers[1], inputIntegers[2]);
        isTeen(13);

    }


    public static boolean hasTeen(int x, int y, int z) {
        boolean isWithinRange = false;
        int[] numberArray = {x, y, z};
        for (int number : numberArray) {
//            System.out.println(number >= 13 && number <= 19 ? "The number: " + number + " is within the range 13 - 19" :
//                    "The number: " + number + " is outside the range 13 -19");

            if (number >= 13 || number <= 19) {
                isWithinRange = true;
                System.out.println("hasTeen returns: " + true);
                break;
            }
            break;
//            isWithinRange = number >= 13 && number <= 19 ? true : false;

        }
        System.out.println("contain teen: " + isWithinRange);
        return isWithinRange;

    }

    public static boolean isTeen(int a) {
        boolean isTeen = false;
        System.out.println(a >= 13 && a <= 19 ? "The number: " + a + " is a teen number" :
                "The number: " + a + " is not a teen number");
        isTeen = a >= 13 && a <= 19 ? true : false;

        return isTeen;
    }


}
