package ch12;

public class Main {
    public static void main(String[] args) {
        MyService srv1 = new MyService("수강 관리 서비스");
        MyService srv2 = new MyService("학생 정보 관리 서비스");

        srv1.start(); // 스레드에 start구현되어 있음 상속 받아서 MyService가 사용 가능 // 스레드 시작
        srv2.start(); //다른 스레드 시작
    }
}
