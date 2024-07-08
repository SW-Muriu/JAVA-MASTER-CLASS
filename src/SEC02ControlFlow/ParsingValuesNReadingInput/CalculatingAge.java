package SEC02ControlFlow.ParsingValuesNReadingInput;

public class CalculatingAge {

    public static void main(String[] args) {
        String dateOfBirth = "1995";
        String currentYear = "2024";

        System.out.println("Age is: " + (Integer.parseInt(currentYear) - Integer.parseInt(dateOfBirth)));


        String usersAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);

    }

}
