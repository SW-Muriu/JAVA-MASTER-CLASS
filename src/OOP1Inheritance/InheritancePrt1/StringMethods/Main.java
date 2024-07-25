package OOP1Inheritance.InheritancePrt1.StringMethods;

public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation(" ");
        printInformation("\t \n");


        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        String hellowWorldlLower = helloWorld.toLowerCase();
        boolean equals = hellowWorldlLower.equals(hellowWorldlLower);
       if (equals) System.out.println("Values Match Exactly");

        boolean equals1 = hellowWorldlLower.equalsIgnoreCase(hellowWorldlLower);
        if (equals1) System.out.println("Values Match ignoring case");


    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if(string.isEmpty()){
            System.out.println("String is Empty");
        }

        if(string.isBlank()){
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length-1));

    }
}

