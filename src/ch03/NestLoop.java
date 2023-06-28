package ch03;

public class NestLoop {
    public static void main(String[] args) {
        //구구단 구하기 중첩 반복문
        // 중첩 (Nested)
        for (int i = 2; i < 10 ; i++) {
            for (int j = 1; j < 10 ; j++) {
                System.out.println(i+"x"+j+" = "+i*j);
            }

        }
    }
}
