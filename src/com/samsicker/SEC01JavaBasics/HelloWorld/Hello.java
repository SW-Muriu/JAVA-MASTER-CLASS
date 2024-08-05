package com.samsicker.SEC01JavaBasics.HelloWorld;

public class Hello {
    public static void main(String[] args) {
        System.out.println("My Name is Sam");

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an Alien");
            System.out.println("And I am scared of Aliens");
        }

        int topScore = 81 ;
        if (topScore >= 100) System.out.println("You got the high score!!!");

        int secondTopScore = 95;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than secondTopScore and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }


        boolean isCar = false;
        //Carefull not confuse equal operator and assignment operator
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }


        // Ternary Operand
        //Has three operands. The first must be boolean, and gives a condition
        //second operand is assigned if the condition is true
        String makeOfCar = "Volkswagen";


        boolean isDomestic = makeOfCar == "Volkswagen" ? false: true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        } else {
            System.out.println("This car is not domestic to our country");
        }

        int ageOfClient = 20;
        String ageText = ageOfClient >= 18? "Over Eighteen" : "Still a kid";
        System.out.println("Our Client is: " + ageText);

        String s = (isDomestic)? "This car is domestic to our country":  "This car is not domestic to our country";
        System.out.println(s);

    }


}


