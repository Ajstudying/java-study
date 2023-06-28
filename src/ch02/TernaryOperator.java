package ch02;

public class TernaryOperator {
    public static void main(String[] args) {
        // 삼항연산자
        // 항이 3개다
        // 3항 연산의 구조 조건식 ? 값1 : 값2
        // 조건식의 값이 true이면 ? 뒤의 값을 반환
        // 조건식의 값이 false이면 : 뒤의 값을 반환
        // 조건식은 true/false를 반환하는 식만 온다.
        int num1 = 10;
        int num2 = 5;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("더 큰 숫자는: "+max);

    }
}
