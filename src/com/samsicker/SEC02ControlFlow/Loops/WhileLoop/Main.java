package com.samsicker.SEC02ControlFlow.Loops.WhileLoop;

public class Main {
    public static void main(String[] args) {

        int j = 1;
        while (j <= 5){
            System.out.println(j);
            j++;
        }

        //The above can also be achieved as follows
        int i = 10;
        while (true){
            //Insert a break
            if (i > 15) {
                break;
            }
            System.out.println("b " + i);
            i++;
        }


        //Assuming we want the code to run based on a condition, and using do while

        boolean isReady = false;
        do{
            if (i > 20) break;
            System.out.println("C test: " + i);
            i++;
        } while (isReady);

    }
}
