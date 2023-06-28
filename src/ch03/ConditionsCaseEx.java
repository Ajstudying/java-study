package ch03;

public class ConditionsCaseEx {
    public static void main(String[] args) {
        int x = 11;
        String result = x > 10 ? "큰 수" : "작은 수";
        System.out.println(result);

        int score = 85;
        String pass = score >= 80 ? "통과" : "불통과";
        System.out.println(pass);

        int number = 3;
        if (number >0) {
            System.out.println("양수");
        } else if (number <0) {
            System.out.println("음수");
        } else {
            System.out.println("0");
        }

        int age = 20;
        String guidLine = age >= 20 ? "성인" : "미성년자";
        System.out.println(guidLine);

        int month = 1;
        switch (month) {
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
        }

        int year = 2020;
        String leapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? "윤년" : "평년";
        System.out.println(leapYear);

        int num1 = 4;
        int num2 = 4;
        if (num1 == num2) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }

        int a = 0;
        int b = 0;
        int c = 0;
        if (a>0 && b>0 && c>0) {
            System.out.println("양수");
        } else if (a==0 && b==0 && c ==0) {
            System.out.println("0");
        } else {
            System.out.println("음수");
        }

        int score1 = 95;
        if (score1 >= 90) {
            System.out.println("A");
        }else if (score1 >= 80) {
            System.out.println("B");
        }else if (score1 >= 70) {
            System.out.println("C");
        }else if (score1 >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }

        int num = 3;
        if (num % 3 ==0 && num % 5 ==0) {
            System.out.println("3과 5의 배수");
        }else if (num % 3 == 0) {
            System.out.println("3의 배수");
        }else if (num % 5 == 0) {
            System.out.println("5의 배수");
        }else {
            System.out.println("해당없음");
        }





    }
}
