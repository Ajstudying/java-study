package ch02;

public class OperatorPriority {
    public static void main(String[] args) {
        //대입 연산
        // +=, -=, *=, /=, %=
        int number = 10;
        // number = number + 10;
        number += 10;
        // number = number - 10;
        number -= 10;

        int a = 4;
        int b = 2;
        int c = 6;
        int result = a + b * --c;
        System.out.println(result);

    }
}
