package ch07.abstractClass;

//저축성 계좌
public class SavingsAccount extends Account {
    double interestRate; // 이율

    SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    void endOfMonth() { // 월단위 이자 추가
        //이자 계산 해서 밸런스에 넣어줌
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + " added. New balance: " + balance);
    }
}