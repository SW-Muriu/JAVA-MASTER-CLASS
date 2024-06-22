package SEC02ControlFlow.Loops.Exercises;

public class EvenDigitSum {

    public static void main(String[] args) {

        int testNumber = 43784;
        int sum = getEvenDigitSum(testNumber);
        System.out.println("The sum of even digits in " + testNumber + " is: " + sum);

    }

    public static int getEvenDigitSum(int number){

        int sumOfEvenDigits = 0;

        //Return negative one to mark invalidity
        if(number < 0 ) return -1;

        int lastDigit = number % 10;

        if (lastDigit % 2 == 0 ) sumOfEvenDigits += lastDigit;

        while (number >= 10){
            number /= 10;

            // save the last number at each iteration
            int newLastDigit = number % 10;

            if (newLastDigit % 2 == 0 ) sumOfEvenDigits += newLastDigit;
        }

        return sumOfEvenDigits;

    }
}

