package account;

import java.util.Scanner;

public class AccountManagement {
    private Account[] accountList;  // 계좌 목록 배열
    private int numAccounts;        // 계좌의 개수
    private Scanner scanner;        // 사용자 키보드 입력 객체

    // 최대 입력 가능한 계좌개수를 매개변수를 입력받는 생성자
    public AccountManagement(int maxSize) {
        accountList = new Account[maxSize]; // 계좌 목록 배열을 생성
        numAccounts = 0;                    // 현재 생성된 계좌의 개수
        scanner = new Scanner(System.in);   // 사용자 입력 객체 생성
    }

    public void addAccount(String accountNumber, double balance) {
        // **코드 작성
        // 계좌번호와 초기 입금액을 입력 받고 계좌객체를 생성한 후 배열의 앞에서부터 가장 처음 빈공간에 추가한다.
        // 단, 배열에 추가한 후 numAccounts를 증가시킨다.
        if (numAccounts<100){
            Account ac = new Account(accountNumber,balance);
            this.accountList[numAccounts] = ac;
            if (numAccounts == 0){
                System.out.println(ac.getAccountNumber() + "로 계좌가 만들어졌습니다.");
                this.numAccounts++;
            }else{
                for (int i = 0; i < numAccounts; i++) {
                    if(numAccounts >= 1 && accountList[numAccounts].getAccountNumber() != accountList[i].getAccountNumber()) {
                        System.out.println(ac.getAccountNumber() + "로 계좌가 만들어졌습니다.");
                        this.numAccounts++;
                    }else{
                        System.out.println("계좌번호가 중복됩니다. 다시 설정해 주십시오");
                    }
                }
            }
        }else{
            System.out.println("더 이상 계좌를 만들 수 없습니다.");
        }
    }

    public void showAccountList() {
        // **코드 작성
        // 계좌 목록을 출력
        // 예시 출력 형태
        // ------------------------------------
        // 계좌번호: [계좌번호1], 잔액: [잔액1]
        // 계좌번호: [계좌번호2], 잔액: [잔액2]
        // ...
        // ------------------------------------.
        if (numAccounts == 0){
            System.out.println("조회할 계좌가 없습니다.");
        }else {
            for (int i = 0; i < numAccounts; i++) {
                System.out.println("계좌번호: " + "[" + accountList[i].getAccountNumber() + "] , " + "잔액: " + "[" + accountList[i].getBalance() + "]");
            }
        }

        /*for (Account i : accountList) {
            if (i != null){
                System.out.println("계좌번호: "+"["+i.getAccountNumber()+"] , "+"잔액: "+"["+i.getBalance()+"]");
            }else {
                System.out.println("계좌가 더 이상 없습니다.");
                break;
            }
        }*/

        /*for(Account account : this.accountList){
            if (account == null){
                System.out.println("더 이상 계좌가 조회되지 않습니다.");
                break;
            }
            System.out.println("계좌번호: [" + account.getAccountNumber() + "], 잔액: [" + account.getBalance() + "]");
        }*/



    }

    // 계좌 객체에 잔액 증가
    public void deposit(String accountNumber, double amount) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾고 출금 금액 만큼 잔액을 차감한다.
        // 단, Account 클래스의 deposit 메서드를 사용하여야 한다.
        /*try {
            Account acc = findAccount(accountNumber);
            acc.deposit(amount);

        }
            catch (NullPointerException e) {
                System.out.println("계좌번호를 다시 입력해주세요.");
            }
        }*/
        Account acc = findAccount(accountNumber);
        if (acc == null){
            System.out.println("계좌번호를 다시 입력해주세요");
        } else {
            acc.deposit(amount);
        }
    }

    public void withdraw(String accountNumber, double amount) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾고 출금 금액 만큼 잔액을 차감한다.
        // 단, Account 클래스의 withdraw 메서드를 사용하여야 한다.
        try {
            Account acc = findAccount(accountNumber);
            acc.withdraw(amount);

        }
         catch (NullPointerException e){
            System.out.println("계좌번호를 다시 입력해주세요.");
        }
    }



    // 계좌 객체에 잔액 차감
    private Account findAccount(String accountNumber) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾아서 리턴하는 메서드 작성

        /*for(Account i : this.accountList){
            String number = i.getAccountNumber();
            if (number.equals(accountNumber)) {
                return i;
            }
        }
        return null;*/

        /*for (int i = 0; i < numAccounts; i++) {
            String num = this.accountList[i].getAccountNumber();
            if (num.equals(accountNumber)){
                return this.accountList[i];
            }
        }
        return null;*/

        /*Account findAccount = null;
        for (Account account : this.accountList) {
            if (account == null) {
                break;
            } else if (account.getAccountNumber().equals(accountNumber)) {
                findAccount = account;
                break;
            }

        }return findAccount;*/

        for (Account account : this.accountList){
            if(account == null){
                break;
            } else if (account.getAccountNumber().equals(accountNumber)){
                Account findAccount = account;
                return findAccount;
            }
        }return null;

    }


    public void run() {
        while (true) {
            //UX, 기능목록 출력
            System.out.println("\n=== 계좌 관리 프로그램 ===");
            System.out.println("1. 계좌 추가");
            System.out.println("2. 계좌 목록 조회");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("0. 종료");
            System.out.print("원하는 기능을 선택하세요: ");

            //메뉴번호 받기
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("계좌번호: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("잔액: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    addAccount(accountNumber, balance);
                    break;
                case 2:
                    showAccountList();
                    break;
                case 3:
                    System.out.print("계좌번호: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("입금액: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    deposit(accountNumber, depositAmount);
                    break;
                case 4:
                    System.out.print("계좌번호: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("출금액: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // 개행 문자 제거
                    withdraw(accountNumber, withdrawAmount);
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}
