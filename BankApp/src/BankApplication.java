import java.util.*;

public class BankApplication {
    private Bank bank;
    private Scanner scanner;

    public BankApplication() {
        bank = new Bank();
        scanner = new Scanner(System.in);
    }
    public void MainMenu() {

            System.out.println("\nBanking Application");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    openAccount();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    viewBalance();
                    break;
                case 5:
                    System.out.println("Exiting application.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
    }

    private void openAccount() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter interest rate (for savings account): ");

        SavingAccount account = new SavingAccount(accountNumber,accountHolder, balance);
        bank.addAccount(account);
    }

    private void depositMoney() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        bank.depositToAccount(accountNumber, amount);
    }

    private void withdrawMoney() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        bank.withdrawFromAccount(accountNumber, amount);
    }

    private void viewBalance() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        bank.displayBalance(accountNumber);
    }

    public static void main(String[] args) {
        BankApplication app = new BankApplication();
        app.MainMenu();

    }
}
