package ch08;

import ch08.InterfaceBundle.BankAccount;

public class CheckingAccount implements BankAccount {
    private double checkBalance;
    
    public CheckingAccount(double checkBalance){
        this.checkBalance = checkBalance;
    }
    
    public void deposit(double amount) {
        this.checkBalance += amount;
        System.out.println("입금 후 잔액은 " + checkBalance + "입니다.");
    }
    public void withdraw(double amount) {
        if(checkBalance >= amount){
            this.checkBalance -= amount;
            System.out.println("출금 후 잔액은 " + checkBalance + "입니다.");
        }else{
            System.out.println("잔액이 부족합니다.");
        }
    }
    public void getBalance() {
        System.out.println("현재 잔액은: " + checkBalance + "입니다.");
    }

}
