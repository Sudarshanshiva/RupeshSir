package com.Guddu;

import java.util.Arrays;
import java.util.Scanner;

public class looparray {
    public  static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new  int[5];
        arr[0] = 435;
        arr[1] = 45;
        arr[2] = 445;
        arr[3] = 27;
        arr[4] = 35;
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
             arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
//            System.out.print(Arrays.toString(arr));
            System.out.print(arr[i] + " ");
        }

    }
}
