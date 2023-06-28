package ch05.accessModifier;

public class BankAccount {
    private int balance;        //private 필드

    //private 메서드
    // 클래스 만든 사람만 가져다 쓸려고 만듬.
    private void deductFunds (int amount) {     //공제 자금, 자금을 공제 한다.
        if (amount <= balance){
            balance -= amount;
        }else {
            // insufficient : 불충분
            System.out.println("Insufficient funds!");
        }
    }
}
