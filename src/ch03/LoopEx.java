package ch03;


public class LoopEx {
    public static void main(String[] args) {
/*        for (int i = 1; i < 11; i++) {
            System.out.print(i);
        }
        System.out.println("----------");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
            }
        }

        System.out.println();

        for (int i = 1; i <10 ; i++) {
            System.out.println("5 x "+ i + " = "+ 5*i);
        }

        for (int i = 10; i >0 ; i--) {
            System.out.println(i);

        }
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                sum += i;

            }

        }System.out.println("5의 배수의 합계는 " + sum);


        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }else {
                oddSum += i;
            }

        }
        System.out.println("짝수의 합계는 " + evenSum);
        System.out.println("홀수의 합계는 " + oddSum);*/

        /*for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 5-i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 5-i; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }*/


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 5-i; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1 ; j++) {
                 System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5-i  ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // 도트그래픽 2D (x, y 축)
        // 행(가로, y) 이게 더 상위 개념, 열(세로, x) 이게 하위 개념

        // 반복문을 돌리려면, 가장 바깥 반복문이 행을 제어하는 반복문
        // 1번째 행 -> 1번째 열, 2번째 열... 밑으로 내려감
        // 2번째 행 -> 2번째 열, 2번째 열... 밑으로 내려감
        int n = 5;

        for(int i =1; i <= n; i++){
            //i = 1, 첫번째 행을 출력
            //i = 2, 두번째 행을 출력

            // 빈 공간 출력 ( 5-i (행번호) 만큼 출력)
            for(int j = 1; j <= n -i; j++) {
                System.out.print(" ");
            }
            //별 출력 (2*i(행번호)-1 만큼 출력
            for(int k =1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            //밑줄로 내림
            System.out.println();
        }




    }
}
