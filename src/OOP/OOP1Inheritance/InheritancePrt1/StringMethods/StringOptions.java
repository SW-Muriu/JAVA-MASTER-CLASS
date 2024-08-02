package OOP.OOP1Inheritance.InheritancePrt1.StringMethods;

public class StringOptions {
    public static void main(String[] args) {

        String helloWorld = "Hello" + " World";

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyString = new StringBuilder();
        emptyString.append("a".repeat(17));
        StringBuilder emptyString32 = new StringBuilder(32);
        emptyString32.append("a".repeat(32));


        printInformation(emptyString);
        printInformation(emptyString32);

        StringBuilder builderPlus = new StringBuilder("Hello " + "World");
        builderPlus.append(" and Goodbye");
        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);
        builderPlus.replace(16,17,"G");
        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string){
        System.out.println("String = " + string);
        System.out.println("String Length= " + string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("String Builder = " + builder);
        System.out.println("String Builder Length = " + builder.length());
        System.out.println("String Builder Capacity = " + builder.capacity());
    }
}
