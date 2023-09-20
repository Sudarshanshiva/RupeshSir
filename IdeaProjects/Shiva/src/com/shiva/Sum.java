package com.shiva;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans =sum();
        System.out.println(ans);

    }
//    static void sum2(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter number 1");
//        int num1 = in.nextInt();
//        System.out.println("enter number 2");
//        int num2 = in.nextInt();
//        int sum= num1+num2;
//        System.out.println(sum);
//    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = in.nextInt();
        System.out.println("enter number 2");
        int num2 = in.nextInt();
        int sum= num1+num2;
        return sum;
    }

}
