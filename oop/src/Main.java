import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("welcome");
        System.out.println("To create a bank account, please enter your name: ");
        String nameScan = scanner.nextLine();
        BankAccount yourBankAccount = new BankAccount(500, nameScan);
        System.out.println("Congratulation, " + nameScan + ", you are gifted 500 to stimulate the economy.");

        while (true) {
            System.out.println("What would you like to do? ");
            System.out.println("[1] deposit \n[2] withdraw \n[3] a method where you can check your balance \n[4] proceed to the next part");
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                System.out.println("How much would you like to deposit?");
                double depositAmount = (double) scanner.nextDouble();
                yourBankAccount.deposit(depositAmount);
                continue;
            }
            if (choice == 2) {
                System.out.println("How much would you like to withdraw?");
                double withdrawAmount = (double) scanner.nextDouble();
                yourBankAccount.withdraw(withdrawAmount);
                continue;
            }
            if (choice == 3) {
                System.out.println(yourBankAccount.accountDetails());
                continue;
            }
            if (choice == 4) {
                System.out.println("you chose to proceed.");
                
                String thisFixesABug = scanner.nextLine();
                System.out.println("pick a name for your friend:");
                String friend1 = scanner.nextLine();
                System.out.println(friend1 + "-initializing");

                System.out.println("wow, pick a name for another friend");
                String friend2 = scanner.nextLine();
                System.out.println(friend2 + "-initializing");


                System.out.println("Creating bank accounts for " + friend1 + " and " + friend2);
                BankAccount bankAccountFriend1 = new BankAccount(5000, friend1);
                BankAccount bankAccountFriend2 = new BankAccount(300, friend2);
                System.out.println("Pulling up information and populating with money...");

                System.out.println(bankAccountFriend1.accountDetails());
                System.out.println(bankAccountFriend2.accountDetails());

                System.out.println("would you like to even things out a bit?");
                System.out.println("y/n");
                String friendChoice = scanner.nextLine();
                if (friendChoice.equals("y")) {
                    bankAccountFriend1.withdraw(100);
                    bankAccountFriend2.deposit(100);
                    System.out.println(bankAccountFriend1.accountDetails());
                    System.out.println(bankAccountFriend2.accountDetails());
                    break;
                }
                else {
                    System.out.println("nice");
                    break;
                }
            }
            else {
                break;
            }
        }
    }
}