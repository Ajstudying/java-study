package ch02;

public class Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        // AND(논리곱) 연산자 && (ampersand)
        boolean result = a && b;
        boolean result1 = b && a;
        // short-circuit evaluation(단락 평가)
        // 왼쪽 값에 의해서 연산 결과를 도출할 수 있으면, 오른쪽 값은 판단하지 않음.
        System.out.println(result);

        // OR(논리합) 연산자 ||(pipe)
        boolean result2 = a || b;




    }
}
