package com.shiva;

import java.util.Arrays;

public class Function {
    public static void main(String[] args) {
        int arr[] = {1,2,45,50,4};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[]num){
        num[0]=100;
    }
}
