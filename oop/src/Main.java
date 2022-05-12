import java.util.Scanner;
import java.util.ArrayList;
import java. lang. Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("welcome");
            System.out.println("are you a new user? y/n");
            String newUser = scanner.nextLine();
            ArrayList<BankAccount> accountList = new ArrayList<BankAccount>();
            if (newUser.equalsIgnoreCase("y")) {
                System.out.println("To create bank account, please enter your first name: ");
                String nameScan = scanner.nextLine();
                int accountNumber = (int) ((Math.random() * 6000) + 0);
                BankAccount bankAccount = new BankAccount(500, nameScan, accountNumber);
                accountList.add(bankAccount);
                System.out.println("Congratulation, " + nameScan + ", you are gifted 500 to stimulate the economy.");
                while (true) {
                    System.out.println("What would u like to do? ");
                    System.out.println(
                            "[1] deposit \n[2] withdraw \n[3] check account details \n[4] exit");
                    int choice = scanner.nextInt();

                    if (choice == 1) {
                        System.out.println("How much would you like deposit?");
                        double depositAmount = (double) scanner.nextDouble();
                        bankAccount.deposit(depositAmount);
                        continue;
                    }
                    if (choice == 2) {
                        System.out.println("How much would you like to withdraw?");
                        double withdrawAmount = (double) scanner.nextDouble();
                        bankAccount.withdraw(withdrawAmount);
                        continue;
                    }
                    if (choice == 3) {
                        System.out.println(bankAccount.accountDetails());
                        continue;
                    }
                    if (choice == 4) {
                        System.out.println(accountList);
                        int accountCheck = accountList.get(0).accountNumber();
                        System.out.println(accountCheck);
                        System.out.println("you chose to exit. goodbye.");
                        String bugFix = scanner.nextLine();
                        break;
                    }
                }
            }
            if (newUser.equalsIgnoreCase("n")) {
                System.out.println("enter account number");
                int inputAccountNumber = scanner.nextInt();
                for (int i = 0; i < accountList.size()+1; i++) {
                    int accountCheck = accountList.get(i).accountNumber();
                    System.out.println(inputAccountNumber + " " + accountCheck);
                    if (inputAccountNumber == accountCheck) {
                        System.out.println("success");
                    }
                    else {
                        System.out.println("try again");
                    }
                }
            }

        }
    }
}