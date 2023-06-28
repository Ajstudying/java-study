package ch08;

import ch08.InterfaceBundle.BankAccount;
public class BankTest {
    public static void main(String[] args) {
        BankAccount b = new CheckingAccount(1000000);
        BankAccount s = new SavingAccount();
        b.deposit(1000);
        b.withdraw(10);
        b.getBalance();
        s.deposit(10000);
        s.withdraw(10);
        s.getBalance();

    }
    static void testBankAccount(BankAccount b){


    }
}
