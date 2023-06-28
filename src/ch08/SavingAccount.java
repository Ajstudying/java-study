package ch08;

import ch08.InterfaceBundle.BankAccount;

public class SavingAccount implements BankAccount {
    private double saveBalance;

    public SavingAccount() {
        this.saveBalance = 0;
    }
    public void deposit(double amount) {
        this.saveBalance += amount;
        System.out.println("해당 적금에 " + amount + "만큼이 입금되어 " + saveBalance + "입니다.");
    }
    public void withdraw(double amount) {
        if(saveBalance >= amount){
            this.saveBalance -= amount;
            System.out.println("출금 후 적금 잔액은 " + saveBalance + "입니다.");
        }else{
            System.out.println("적금 잔액이 부족합니다.");
        }
    }
    public void getBalance() {
        System.out.println("현재 적금 잔액은: " + saveBalance + "입니다.");
    }

}
