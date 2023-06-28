package ch01;

import java.util.Arrays;

public class Casting {
    public static void main(String[] args) {
        // 형 변환 ( 형식 변환, Casting, Conversion)

        // 1. 묵시적 형변환 (자동 형변환, implicit conversion) 안 쓰는게 좋음 / 알 수 없는 오류 가능성, side-effect, smell

        int x = 10;
        double y = x;

        // 2. 명시적 형변환 (explicit conversion) 명시적: 표기해주는 것.

        double a = 10.5;
        int b = (int) a;

        // 숫자-> 문자열
        int number = 105;
        String str = Integer.toString(number);
        String strValue = String.valueOf(number);
        System.out.println(str);
        System.out.println(strValue);

        //소수점이 있는 10진수 : decimal
        double decimal = 10.5;
        String strDecimal = Double.toString(decimal);
        System.out.println(strDecimal);
        String strDecimalValue = String.valueOf(decimal);
        System.out.println(strDecimalValue);

        // String.valueOf(아무 데이터 타입값)

        // 문자열 -> 숫자
        String numstr = "10";
        //자료형 클래스.valueOf(문자열)
        int num1 = Integer.parseInt(numstr);
        int num2 = Integer.valueOf(numstr);
        System.out.println(num1);
        System.out.println(num2);
        double num3 = Double.valueOf(numstr);
        System.out.println(num3);

        int nums = 123;
        String st = String.valueOf(nums);
        System.out.println(st);

        double deci = 3.14;
        String dou = Double.toString(deci);
        System.out.println(dou);

        String integer = "456";
        int sr = Integer.valueOf(integer);
        System.out.println(sr);

        String double1 = "2.718";
        double d = Double.parseDouble(double1);
        System.out.println(d);

        boolean bool = true;
        String boo = String.valueOf(bool);
        System.out.println(boo);

        char ch = 'A';
        String chr = String.valueOf(ch);
        System.out.println(chr);

        int[] arr = { 1, 2, 3 };
        String ar = Arrays.toString(arr);
        System.out.println(ar);


    }
}
