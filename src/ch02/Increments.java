package ch02;

public class Increments {
    public static void main(String[] args) {
        // increment, decrement(reduction)
        // 증가 또는 감소 연산

//        int a = 10;
//        // ++a 와 a = a + 1 이 같다.
//        // 증가 연산은 결과적으로 변수의 값을 증가시킨다.
//        System.out.println(++a);
//        System.out.println(a);
//        System.out.println(a = a + 1);

        System.out.println("----------------------");
        //후행 연산
        // 현재 처리하고 있는 구문(statement)에서는 현재값을 반영하고, 다음 구문부터 증가된 값이 반영

//        System.out.println(a++); //세미콜론으로 끝나는 1개의 단위를 구문, 식(expression)
//        System.out.println(a);
//
//        System.out.println("---------------");
//        //감소연산
//        System.out.println(--a);
//        System.out.println(a--);
//        System.out.println(a);

//        int number = 10;
////         number -= 10;
////         System.out.println(number);
//        number /= 2;
//        System.out.println(number);

        int x = 5;
        x++;
        System.out.println(x); //6
        int y = 7;
        --y;
        System.out.println(--y); //5
        int a = 10;
        a--;
        a--;
        a--;
        System.out.println(a); //7
        int b = 15;
        ++b;
        ++b;
        ++b;
        System.out.println(++b); //19
        int i = 3;
        i++;
        i++;
        System.out.println(i); //5
        int j = 6;
        System.out.println(--j); //5
        int n = 8;
        n--;
        n--;
        n--;
        System.out.println(n); //5
        int m = 12;
        ++m;
        ++m;
        ++m;
        ++m;
        System.out.println(++m); //17
        int p = 2;
        p++;
        p++;
        p++;
        p++;
        System.out.println(p); //6
        int q = 9;
        --q;
        System.out.println(--q); //7


        int price = 187000;

        int div1 = price % 50000;
        int div2 = div1 % 10000;
        int div3 = div2 % 5000;

        int oman = price / 50000;
        int ilman = div1 / 10000;
        int ochun = div2 / 5000; //price % 10000 과 ((price % 50000)%10000 과 동일하다.
        int ilchun = div3 / 1000; // 위와 마찬가지로 price % 5000 / 1000; 으로 코드를 줄일 수 있다.



        System.out.println("5만원권 : " + oman + "장");
        System.out.println("1만원권 : " + ilman + "장");
        System.out.println("5천원권 : " + ochun + "장");
        System.out.println("1천원권 : " + ilchun + "장");

        int number = 1234;
        int result = (number / 100) * 100;
        System.out.println(result);



    }
}
