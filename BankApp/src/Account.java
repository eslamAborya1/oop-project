public class Account {
    String acc_number;
    String acc_holder;
    double balance;

    public Account(String acc_number,String acc_holder, double balance) {
        this.acc_number = acc_number;
        this.acc_holder=acc_holder;

        if(balance>0)
            this.balance=balance;
        else
            System.out.println("initial balance must be positive");

    }

    public void Deposite(double amount){
        if(amount>0){
        balance+=amount;
        System.out.println("Deposited");}
        else
        System.out.println("the amount must be positive");
    }

    public void Withdraw(double amount){
        if(amount<balance && amount>0){
        balance-=amount; }
        else
            System.out.println("the amount is not valid");
    }

    public double getBalance()
    {
        return balance;
    }
}
