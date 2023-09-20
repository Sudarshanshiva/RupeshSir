package com.Guddu;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr =new int[5];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);

//        String[] ros = new String[5];
//        System.out.println(ros[3]);
    }
}