public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(double balance, String customerName){
        this.balance = balance;
        this.name = customerName;
    }

    public double deposit(double x) {
        return balance += x;
    }

    public double withdraw(double x) {
        return balance -= x;
    }

    public String accountDetails() {
        return "account name: " + name + " money: " + balance;
    }

    public double transferSend(double x) {
        return balance -= x;
    }
}