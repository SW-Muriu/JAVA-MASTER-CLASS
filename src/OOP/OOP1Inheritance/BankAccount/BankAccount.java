package OOP.OOP1Inheritance.BankAccount;

public class BankAccount {

    private int accountNumber;
    private double accountBalance;

    private String customerName;
    private String email;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private int phoneNumber;


    //Depositing Funds
    public double depositFunds(double amount){
        return this.accountBalance += amount;
    }

    //Withdrawing Funds
    public double withdrawFunds(double amount){
        if(amount <= this.accountBalance) {
           return this.accountBalance -= amount;
        } else {
            return -1;
        }
    }



}
