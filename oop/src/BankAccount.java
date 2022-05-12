public class BankAccount {
    private String name;
    private double balance;
    private int accountNumber;

    public BankAccount(double balance, String customerName, int accountNumber){
        this.balance = balance;
        this.name = customerName;
        this.accountNumber = accountNumber;
    }

    public double deposit(double x) {
        return balance += x;
    }

    public double withdraw(double x) {
        return balance -= x;
    }

    public String accountDetails() {
        return "account name: " + name + "\nmoney: " + balance + "\naccount number: " + accountNumber;
    }

    public double transferSend(double x) {
        return balance -= x;
    }

    public int accountNumber() {
        return accountNumber;
    }
}