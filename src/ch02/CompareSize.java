package ch02;

public class CompareSize {
    public static void main(String[] args) {
        // 크기 비교 연산자
        // 연산은 왼쪽이 기준이다. a>b : 큰가?
        int a = 5;
        int b = 3;
        boolean result1 = (a > b);
        boolean result2 = (a < b);
        System.out.println(result1);
        System.out.println(result2);
        // a >= b : 크거나 같은가? (greater than, gt)
        boolean result3 = (a >= b);
        // a <= b : 작거나 같은가? (less than, lt)
        boolean result4 = (a <= b);

    }
}
