package OOP1Inheritance.Constructors101;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account(){
        //Constructor Chaining
        //Should always be in the first line of the constructor body

        this("345323", 23, "James", "james@liar.com", "Default Phone");

        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String email, String phone){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("99999", 100.55, customerName, customerEmail, customerPhone);
    }

    //Depositing Funds
    public double depositFunds(double depositAmount){
        return this.balance += depositAmount;
    }

    //Withdrawing Funds
    public double withdrawFunds(double withdrawalAmount){
        if(withdrawalAmount <= this.balance) {
            return this.balance -= withdrawalAmount;
        } else {
            return -1;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}

