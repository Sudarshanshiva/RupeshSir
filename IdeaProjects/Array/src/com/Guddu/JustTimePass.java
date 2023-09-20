package com.Guddu;

import java.util.Arrays;

public class JustTimePass {
    public static void main(String[] args) {
        int[] nums1 = {1,4};
        int[] nums2 = {3,2};
        int a = nums1.length;
        int b = nums2.length;
        int c = a + b;
        int[] arr = new int[c];
        int i=0;
        for ( i = 0;i< a;i++){
            arr[i] = nums1[i];

        }

        for( i = 0;i<b;i++){
            arr[i + a] = nums2[i];
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
