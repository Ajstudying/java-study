package ch11;

public class Main {
    public static void main(String[] args) {
        try {
            // 입력값이라고 생각해보자.
            // 0이 되는 케이스는 주로 입력값을 제대로 못 받은 경우
            int term = 0;
            int amount = 240;
            int result = amount / term;
            System.out.println("한달에 "+result+"만원");
        } catch (ArithmeticException e) { //특정 예외 상황
            System.out.println("산술 연산 예외 발생: "+e.getMessage());
            System.out.println("나누기 연산의 값을 정확히 입력해주세요.");

        }//이 방법은 되도록이면 쓰지 않는 게 좋다. 오류 난 곳을 찾기 힘듬.
        catch (Exception e){ //일반적인 예외 상황 Exception을 제일 뒤에 놔주어야 함. Exception이 다 받아버려서, 무조건 뒤로!
            System.out.println(e.getMessage());
        }

    }
}
