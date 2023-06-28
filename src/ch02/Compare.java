package ch02;

public class Compare {
    public static void main(String[] args) {
        // 동등 비교 연산자
        // 똑같은지 비교
        int a = 5;
        int b = 3;
        boolean result = (a==b); // false
        System.out.println(result);

        //문자열 비교에는 부등기호를 쓰지 않음.
        /*String str1 = "abc";
        String str2 = "abc";
        boolean resultStr = (str1 == str2);
        boolean resultstrNot = (str1 != str2);
        System.out.println(resultStr); //true
        System.out.println(resultstrNot); //false*/


        // 자바의 문자열 비교
        String str3 = new String("abc");
        String str4 = new String("abc");
        boolean resultstr1 = (str3 == str4);
        boolean resultNot1 = (str3 != str4);
        System.out.println(resultstr1); //false // 리터럴 저장되어있는 공간 Heap
        System.out.println(resultNot1); //true
        System.out.println(str3.equals(str4)); //true 문자열의 실제 값을 비교함
        System.out.println(!str3.equals(str4)); //false 변수명 앞에 느낌표를 붙이면 반대 연산(실제 결과값의 반대로 반환)

        // 부등 비교 연산자
        // not equal == 서로 다른가 (!=)
        boolean resultNot =  (a != b); //true
        System.out.println(resultNot);
    }
}
