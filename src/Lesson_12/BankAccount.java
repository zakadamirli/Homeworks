package Lesson_12;

public class BankAccount {
    public static int totalAccounts;

    public BankAccount(){
        totalAccounts++;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        System.out.println("Total accounts: " + totalAccounts);
    }
}
