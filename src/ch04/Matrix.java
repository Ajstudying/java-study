package ch04;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        //다차원 배열
        /* 5x3 형태 배열
        0 1 2 4
        2 4 8 7
        3 6 7 9
         */
        //2차원 배열 초기화
        //[행][열]


        /*int[][] arr = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int input = scanner.nextInt();
                arr[i][j] = input;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/

        /*int[][] arr = { {1, 2}, {3, 4} };
        int[][] arr1 = { {5, 6}, {7, 8}};
        int[][] result = new int[2][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j] + arr1[i][j];
            }

        }System.out.println("결과 배열");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }*/

    }
}
