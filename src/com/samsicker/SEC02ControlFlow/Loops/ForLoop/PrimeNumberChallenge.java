package com.samsicker.SEC02ControlFlow.Loops.ForLoop;

public class PrimeNumberChallenge {
    public static void main(String[] args) {


//        for (int wholeNumber = 1; wholeNumber <= 20; wholeNumber ++){
//            System.out.println(wholeNumber  + " is " + (isPrime(wholeNumber)? "" : "Not ") + "a prime number");
//        }

        int primeCounter = 0;
        for (int wholeNumber = 1; wholeNumber <= 999; wholeNumber ++ ){
            if (isPrime(wholeNumber) == true){
                 primeCounter++;
                 if(primeCounter == 3){
                     break;
                }
            }
        }
        System.out.println(primeCounter);

    }


    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2) {
            return (wholeNumber ==2);
        }

        for (int divisor = 2; divisor < (wholeNumber/2); divisor++) {
            if (wholeNumber % divisor == 0 ){
                return false;
            }
        }
        return true;
    }
}
