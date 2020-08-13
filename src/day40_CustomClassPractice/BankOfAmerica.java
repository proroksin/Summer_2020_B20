package day40_CustomClassPractice;


public class BankOfAmerica {

    public static void main(String[] args) {

        BankAccount Dawud = new BankAccount();
        Dawud.setAccountInfo("Saving", "Dawud Abduwali", "123455678");

        Dawud.getAccountInfo();

        Dawud.deposit(1000);

        Dawud.checkBalance();

        Dawud.Withdraw(500);

        Dawud.checkBalance();

        Dawud.Withdraw(100000);

        Dawud.checkBalance();
    }

}
