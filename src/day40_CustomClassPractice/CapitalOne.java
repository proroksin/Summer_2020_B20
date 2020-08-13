package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount Beslan = new BankAccount();
        BankAccount Ahmet = new BankAccount();
        BankAccount Viorel = new BankAccount();
        BankAccount Nurmamet = new BankAccount();
        BankAccount Wagar = new BankAccount();

        Beslan.setAccountInfo("Checking", "Beslan", "4566568948");
        Ahmet.setAccountInfo("Checking", "Ahmet", "4521231248");
        Viorel.setAccountInfo("Checking", "Viorel", "4567676748");
        Nurmamet.setAccountInfo("Checking", "Nurmamet", "4566121248");
        Wagar.setAccountInfo("Checking", "Wagar", "4566121118");

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(Beslan,Ahmet,Viorel,Nurmamet,Wagar));
        //                               0      1     2       3       4
        for(BankAccount each : accounts){
            each.deposit(500);
            each.getAccountInfo();
        }

        accounts.get(3).deposit(10000);
        accounts.get(3).checkBalance();
        accounts.get(3).Withdraw(9000);
        accounts.get(3).checkBalance();

        accounts.get(4).deposit(600);
        accounts.get(4).checkBalance();

        System.out.println("*******************************************************************");
        accounts.removeIf( each -> each.balance<1000);
        for(BankAccount each : accounts){
            System.out.println(accounts.size());
        }




    }
}
