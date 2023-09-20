package com.Guddu;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(n);

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
