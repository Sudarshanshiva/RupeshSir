package com.Guddu;

import java.util.Arrays;
import java.util.Scanner;

public class multidimentionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */
        int[][] arr= new int[3][3];
//        int[][] num = {
//                {1, 2, 3},//0th index
//                {4, 5, 6},//1st index
//                {7, 8, 9}//2nd index
//        };
//        System.out.println(Arrays.toString(num));


        for (int row = 0; row < arr.length; row++) {
       //for col1
            for (int col = 0; col < arr[row].length; col++) {
                 arr[row][col] = in.nextInt();
            }
        }
//        for (int row = 0; row < arr.length; row++) {
//           //for col
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(Arrays.toString(arr));
//            }
//            System.out.println( );
//        }
        for (int row = 0; row < arr.length; row++) {
            //for col
            System.out.println(Arrays.toString(arr[row]));
            System.out.println( );
        }
    }
}