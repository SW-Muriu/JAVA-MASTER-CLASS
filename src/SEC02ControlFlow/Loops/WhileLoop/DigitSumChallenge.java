package SEC02ControlFlow.Loops.WhileLoop;

public class DigitSumChallenge {
    public static void main(String[] args) {

        System.out.println("The sum of the digits in number 5 is " + sumDigits(5));
        System.out.println("The sum of the digits in number 4785 is " + sumDigits(4785));
        System.out.println("The sum of the digits in number 3454 is " + sumDigits(3454));
        System.out.println("The sum of the digits in number -987 is " + sumDigits(-987));
        System.out.println("The sum of the digits in number 13432 is " + sumDigits(13432));
    }

    public static  int sumDigits(int number){
        if(number < 0 ) return -1;
        int sumOfDigits = 0;

        while(number > 10){
            int j = number % 10;
            sumOfDigits += j;
            number = number /10;
        }

        return sumOfDigits +=number;
    }
}
