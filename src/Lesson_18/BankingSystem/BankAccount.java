package Lesson_18.BankingSystem;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositAmount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit is successfully");
        }

    }

    public void withdrawAmount(double amount) throws InsufficientFundsException {
        this.balance -= amount;
        if (this.balance < 0) {
            throw new InsufficientFundsException("result in a negative balance");
        }
        System.out.println("Withdrew");
        System.out.println(this.accountHolder + "'s new balance = " + balance);
    }

    public void transferFunds(BankAccount targetAccount, double amount) throws InsufficientFundsException {
        if (targetAccount != null && amount > 0) {
            this.withdrawAmount(amount);
            targetAccount.depositAmount(amount);
            System.out.println(amount + " fund transferred to account: " + targetAccount.getAccountHolder());
            System.out.println(targetAccount.accountHolder + "'s new balance = " + targetAccount.getBalance());
        } else {
            throw new InsufficientFundsException("Invalid fund transfer");
        }
    }
}
