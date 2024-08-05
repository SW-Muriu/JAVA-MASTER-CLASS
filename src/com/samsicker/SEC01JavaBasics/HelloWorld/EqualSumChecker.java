package com.samsicker.SEC01JavaBasics.HelloWorld;//Write a method hasEqualSum with 3 parameters of type int.
//The method should return boolean and it needs to return true if the sum of the first
// and second parameter is equal to the third parameter. Otherwise, return false.

import java.util.Scanner;

public class EqualSumChecker {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int x = in.nextInt();
        System.out.println("Input the second number: ");
        int y = in.nextInt();
        System.out.println("Input the thurd number: ");
        int z = in.nextInt();
        hasEqualSum(x,y,z);

    }


    public static boolean hasEqualSum(int x, int y, int z) {
        System.out.println((x + y) == z ? "The sum of the first 2 digits equal the third digit " :
                "The sum of the first 2 digits does not equal the third digit");

        return (x + y) == z;
    }
}
