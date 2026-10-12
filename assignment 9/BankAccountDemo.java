class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class SavingsAccount extends BankAccount {

    double minimumBalance = 1000;

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {

        if (balance - amount >= minimumBalance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Withdrawal not allowed.");
            System.out.println("Minimum balance of " + minimumBalance
                    + " must be maintained.");
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(5000);

        account.deposit(2000);

        account.withdraw(5000);

        account.withdraw(1500);
    }
}