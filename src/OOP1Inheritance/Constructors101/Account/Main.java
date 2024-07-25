package OOP1Inheritance.Constructors101.Account;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);
        bobsAccount.withdrawFunds(200);

        Account timsAccount = new Account("Time", "test@gmail.com", "1232");
        System.out.println( "Tims Account Number: " + timsAccount.getNumber());
        System.out.println( "Tims Account Name: " + timsAccount.getCustomerName());
    }
}
