package com.shiva;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a=0;
      int b=1;
      int count = 2;
      while (count<=n){
          int temp = b;
          b=b+a;
          a=temp;
          count++;
      }
        System.out.print(b);

//        System.out.println(a);
//        System.out.println(b);
//        for(int i=0;i<=(n);i++){
//            a=b;
//            b=a+b;
//            System.out.println(b);
//        }

    }
}
