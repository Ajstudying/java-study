package ch05;

import java.util.Scanner;
public class Utils {
    // 05. 클래스 연습문제 메서드 5개를 작성
//    public void sum (int x, int y){
//        System.out.println("두 수의 합계는 " + ((int) x+y));
//    }
    public int sum (int x, int y){
          return x+y; }

    /*public int sum (int x, int y){
        int val = x + y;
        System.out.println("두 수를 더한 값은: "+val);
        return val;
    }*/


//    public void findMax (int x, int y){
//        if (x > y){
//
//            System.out.println("두 숫자 중 큰 값은: "+x);
//        }else {
//            System.out.println("두 숫자 중 큰 값은: "+y);
//        }
//    }
    public int findMax (int x, int y){
        if (x > y){

            return x;
        }else {
            return y;
        }
    }

    /*public static void sumArray (int[] arr) {
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        System.out.println("배열의 합계는: "+sum);
    }*/
    public int sumArray (int[] arr) { //받는 값보다 클 수 있기 때문에 반환값 타입을 Long 으로 해도 됨.
        int sum = 0;
        for (int v : arr){
            //누산(accumulation)
            sum += v;
        }
        return sum;
    }

    /*public static void findLongestString (String[] arr) {
        String longest = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > arr[0].length()){
                longest = arr[i];
            }else {
                longest = arr[0];
            }
        }
        System.out.println("배열 중 제일 긴 글자는: "+longest);
    }*/
    public String findLongestString (String[] arr) {
        String longest = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > arr[0].length()){
                longest = arr[i];
            }else {
                longest = arr[0];
            }
        }
        return longest;
    }

    /*public static void arraysInt (int[] arr){
        int even = 0;
        for (int i : arr) {
            if (i % 2 == 0){
                even++;
            }
        }
        System.out.println("짝수의 갯수는: "+even);
    }*/
    public int arraysInt (int[] arr){
        int even = 0;
        for (int i : arr) {
            if (i % 2 == 0){
                even++;
            }
        }
        return even;
    }



}
