package OOP1Inheritance.Constructors101.ConstructorChallenge;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("James", 567.78, "james@gmail.com");

        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());
    }
}
