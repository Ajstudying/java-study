package ch06.map.account;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class AccountManagement {
    private Map<String, Account> accountMap;  // 계좌 목록 배열
    private Scanner scanner;        // 사용자 키보드 입력 객체

    // 최대 입력 가능한 계좌개수를 매개변수를 입력받는 생성자
    public AccountManagement() {
        accountMap = new TreeMap<>();// 계좌 목록 맵을 생성
        scanner = new Scanner(System.in);   // 사용자 입력 객체 생성

        //scanner = useSccanner(); 이런식으로 요새는 만듬.
    }

    public void addAccount(String accountNumber, double balance) {
        // **코드 작성
        // 계좌번호와 초기 입금액을 입력 받고 계좌객체를 생성한 후 배열의 앞에서부터 가장 처음 빈공간에 추가한다.
        // 단, 배열에 추가한 후 numAccounts를 증가시킨다.
        Account ac = new Account(accountNumber,balance);
        accountMap.put(accountNumber, ac);      //계좌 추가
        /*if (accountMap.size() == 1){
            System.out.println(accountMap.get(accountNumber).getAccountNumber()+"가 생성되었습니다.");
        } else{
            for (int i = 0; i < accountMap.size(); i++) {
                String acc = (String) accountMap.get(i).getAccountNumber();
                if (acc.equals(accountNumber)){
                    System.out.println("계좌번호가 중복됩니다. 다시 입력해주세요.");
                }else{
                    System.out.println(accountMap.get(accountNumber)+"가 생성되었습니다.");
                }
            }
        }*/
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

        // for (Account acc : new TreeMap<>(accountMap).values()){ 트리맵으로 출력할 때, 본래 accountMap을 해쉬맵으로 생성했을 때
        for (String str : accountMap.keySet()) {
                System.out.println("계좌번호: " + "[" + str + "] , " + "잔액: " + "[" + accountMap.get(str).getBalance() + "]");

        }



    }

    // 계좌 객체에 잔액 증가
    public void deposit(String accountNumber, double amount) {
        // **코드 작성
        // 계좌번호로 계좌객체를 찾고 출금 금액 만큼 잔액을 차감한다.
        // 단, Account 클래스의 deposit 메서드를 사용하여야 한다.

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



        for (String account : accountMap.keySet()) {
            if (account == null) {
                break;
            } else if (account.equals(accountNumber)) {
                Account findAccount = accountMap.get(account);
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
