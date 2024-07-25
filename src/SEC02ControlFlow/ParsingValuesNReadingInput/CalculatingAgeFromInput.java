package SEC02ControlFlow.ParsingValuesNReadingInput;

import java.util.Scanner;

public class CalculatingAgeFromInput {
    public static void main(String[] args) {
        int currentYear = 2024;


        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, What's your name?");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were your born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");
        System.out.println("What year were your born? ");
        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of Birth >= " + (currentYear - 125) + " and <= " + (currentYear));

            //Handle badformat exception
            try{
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false: true;
            } catch (NumberFormatException e){
                System.out.println("Characters Not Allowed, Try Again");
            }
        } while (!validDOB);




        return "So, you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }

        return (currentYear-dob);

    }
}
