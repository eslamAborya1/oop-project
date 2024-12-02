import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account.acc_number);
    }

    public Account findAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.acc_number.equals(accountNumber)) {
                return account;
            }}
        System.out.println("Account not found.");
        return null;
    }

    public void depositToAccount(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.Deposite(amount);
        }
    }

    public void withdrawFromAccount(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.Withdraw(amount);
        }
    }

    public void displayBalance(String accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("Balance for account " + accountNumber + ": " + account.getBalance());
        }
    }
}
