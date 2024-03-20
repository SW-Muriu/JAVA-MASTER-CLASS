package HelloWorld;

import java.util.Scanner;

public class CommonParamsInput {

    public static void main(String[] args) {

    }

    public static int[] variablesInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int x = in.nextInt();
        System.out.println("Input the second number: ");
        int y = in.nextInt();
        System.out.println("Input the thurd number: ");
        int z = in.nextInt();

        int [] inputIntegers = {x,y,z};

        return inputIntegers;

    }
}
