package Lesson_18.BankingSystem;

public class MainCustomException {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1, "Zeka", 10000);
        BankAccount bankAccount1 = new BankAccount(2, "Kamal", 15000);

//        bankAccount.depositAmount(4000);

        try {
            bankAccount.transferFunds(bankAccount1, 1000);
        } catch (InsufficientFundsException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
