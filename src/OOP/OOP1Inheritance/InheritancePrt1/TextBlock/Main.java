package OOP.OOP1Inheritance.InheritancePrt1.TextBlock;

public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print a bulleted list: \n " +
                "\t\u2022 First Point \n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        //Using a textblock

        String textBlock  = """
                Print  a Bulleted List:
                 \u2022 Firs Point 
                    \u2022 Sub Point""";

        System.out.println("Text Block: " + textBlock);


        int age = 35;
        int yearOfBirth = 2023 - age;

        //Use of format specifiers
        System.out.printf("Your age is %d, and your birth year is %d", age, yearOfBirth);
    }
}
