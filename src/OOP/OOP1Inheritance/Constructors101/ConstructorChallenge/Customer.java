package OOP.OOP1Inheritance.Constructors101.ConstructorChallenge;

public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;



    //Constructors
    public Customer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer () {
        this("Emmanuel", "test@email.com");
    }

    public Customer(String name, String emailAddress){
        this(name, 500.56 , emailAddress);
    }



    //Getters
    public String getName(){
        return this.name;
    }

    public  String getEmailAddress(){
        return this.emailAddress;
    }

    public double getCreditLimit(){
        return this.creditLimit;
    }
}
