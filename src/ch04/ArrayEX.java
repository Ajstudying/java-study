package ch04;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayEX {
    public static void main(String[] args) {
        //사용자로 부터 콘솔창(터미널)에서 키보드로 입력을 받을 때
        // Scanner를 초기화
        /*Scanner scanner = new Scanner(System.in);

        //정수값 1개를 입력받을 수 있음
        // 커서(프롬프트) 깜빡이고 있다는 것은 입력 대기중
        System.out.print("정수 값을 입력하세요: ");
        int inputNum = scanner.nextInt();

        System.out.println("입력 받은 숫자는: "+inputNum);*/

        /*int[] numbers = new int[5];
        numbers[2] = 7;
        System.out.println(numbers[2]);

        String[] str = {"Java", "Python", "C++"};
        String[] strings = new String[3];
        strings[0] = "Java";
        strings[1] = "Python";
        strings[2] = "C++";*/

        /*int[] length = new int[4];
        for (int i = 0; i < length.length; i++) {
            Scanner scanner1 = new Scanner(System.in);
            int input = scanner1.nextInt();
            length[i] = input;
            System.out.println(length[i]);
        }*/

        /*int[] number = new int[6];
        for (int i = 1; i <= number.length; i++){
            if (i % 2 == 0){
                number[i-1] = i;
            }
            else {
                number[i-1] = 0;
            }

        }System.out.println(Arrays.toString(number));

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));

        int result = 0;
        int[] num = new int[4];
        for (int i = 0; i < num.length; i++) {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            num[i] = input;
            result += num[i];
        }
        System.out.println(Arrays.toString(num));
        System.out.println(result);*/

        /*int[] numbers = new int[5];
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            numbers[i] = input;
            min = numbers[0];
            if (numbers[i] > max){
                max = numbers[i];
            } else if(min>numbers[i]){
                min = numbers[i];
            }

        }
        System.out.println("최대값은: "+ max);
        System.out.println("최소값은: "+ min);*/

        /*String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            str[i] = input;
        }*/

        /*String[] str1 = new String[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < str1.length; i++) {
            String in = scan.nextLine();
            str1[i] = in;
        }
        Arrays.sort(str1);
        for (String element : str1){
            System.out.print(element+ " ");
        }*/

        /*int[] numbers = new int[6];
        int count= 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            int input = scanner.nextInt();
            numbers[i] = input;
            if (numbers[i] % 2 != 0){
                count++;
            }
        }
        System.out.println(count);*/

        /*int[] score = {90, 80, 60, 100};
        int totalScore = 0;
        double avgScore = 0;
        for (int i = 0; i < score.length; i++) {
            totalScore += score[i];
        }
        avgScore = (double) totalScore / (double) score.length;

        System.out.println("합계 점수: "+totalScore);
        System.out.println("평균 점수: "+avgScore);*/

        int[] num1 = {1,2,3,4,5,6,7,8,9,10};
        int[] num2 = new int[10];
        for (int i = 0; i < num1.length; i++) {
            num2[i] = num1[i] * num1[i];
        }
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }




    }
}
