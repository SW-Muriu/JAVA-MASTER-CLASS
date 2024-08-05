package com.samsicker.SEC02ControlFlow.Loops.WhileLoop;

public class EvenNumberChecker {
    public static void main(String[] args) {

        int i = 4;
        int evenNumberCounter = 0;
        int oddNumberCounter = 0;
        while (i <= 20){
            i++;
            if(!isEvenNumber(i)) {
                oddNumberCounter++;
                continue;
            }
            evenNumberCounter++;
            System.out.println("The even Numbers are: " + i + "; ");
            if(evenNumberCounter == 5) break;
        }
        System.out.println("The Total Count of Even numbers is: " + evenNumberCounter + " and that off odd numbers is: " + oddNumberCounter);


    }


    public static boolean isEvenNumber(int number){
        return (number % 2 == 0)? true : false;
    }

}
