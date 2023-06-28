package ch08;

import ch08.InterfaceBundle.Bankable;
import ch08.InterfaceBundle.Loanable;
import ch08.InterfaceBundle.Taxable;

//계좌 클래스
public class Account implements Taxable, Bankable, Loanable {
    private String accountNumber;   // 계좌번호
    private double balance;         // 잔액
    private double tax = 0;
    private double loan;
    private double interest;

    public Account(String accountNumber, double balance, double loan) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.loan = loan;
    }
    public void calculateTax(){
        this.tax = balance * 0.1d;
        System.out.println("현재 세금은: " + tax + "입니다.");
        this.balance -= tax;
        System.out.println("세금을 제외한 나머지 잔액은 " + balance + "입니다.");
    }
    public void calculateInterest(){
        this.interest = loan * 0.01;
        System.out.println("현재 대출금 "+ loan + "에 대한 이자는" + interest);
        this.loan += interest;
        System.out.println("남은 총 대출금은 " + loan);
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    // 계좌 객체에 잔액 증가
    public void deposit(double amount) {
        // **코드 작성
        // 입금 금액 만큼 해당 계좌객체에 잔고(balance) 추가
        this.balance += amount;
        System.out.println(amount + "원 입금이 완료되었습니다.");
        System.out.println("현재 남은 금액은: "+balance+"입니다.");
    }
    // 계좌 객체에 잔액 차감
    public void withdraw(double amount) {
        // **코드 작성
        // 출금 금액 만큼 해당 계좌객체에 잔고(balance) 차감
        // 단, 출금 금액보다 잔액이 적으면 오류 메시지를 출력하면 차감하지 않음
        if (this.balance >= amount){
            this.balance -= amount;
            System.out.println("현재 남은 잔액은: "+balance+" 입니다.");
        }
        else {
            System.out.println("잔액이 부족합니다.");
        }

    }
}
