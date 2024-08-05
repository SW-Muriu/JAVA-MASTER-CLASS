package com.samsicker.SEC01JavaBasics.HelloWorld;

public class OperatorPrecedence {
    public static void main(String [] args) {
        double variableX = 20.00d;
        double variableY = 80.00d;


//        boolean remainderState = variableX + variableY * 100.00 % 40 == 0 ? true: false;
        boolean remainderState = ((variableX + variableY) * 100.00) % 40 == 0 ? true: false;

        if(remainderState) {
            System.out.println("The remainder is zero:" );
        } else {
            System.out.println("The remainder is not zero: ");
        }



    }
}

