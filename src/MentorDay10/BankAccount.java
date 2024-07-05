package MentorDay10;

public class BankAccount {
    int accountNumber=11111111;
    double balance=1000;

    public void depozit(double add){
        balance=balance+add;
        System.out.println(add+" Added");
        System.out.println("Updated balance: "+balance);
    }

    public void cashDraw(double cashdraw){
        if (cashdraw<=balance){
            balance=balance-cashdraw;
            System.out.println(cashdraw+" CashDraw");
            System.out.println("Updated balance: "+balance);
        }else {
            System.out.println("There is not enough money in the balance");
        }

    }


//main method
    public static void main(String[] args) {
        BankAccount obj=new BankAccount();
        System.out.println(obj.balance);
        obj.depozit(500);
        obj.cashDraw(2000);
    }


}

