package com.shiva;

import java.util.Scanner;

public class amstong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int num=in.nextInt();
//        System.out.println(isAmstrong(num));
        for (int i=100;i<=1000;i++){
            if(isAmstrong(i)){
                System.out.println(i + "");
            }
        }

    }

    static boolean isAmstrong(int n){
        int original = n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        return sum == original;
    }
}
