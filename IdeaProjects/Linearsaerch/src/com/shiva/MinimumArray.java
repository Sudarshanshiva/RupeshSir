package com.shiva;

public class MinimumArray {
    public static void main(String[] args) {
        int[] arr = {12,3,45,-5,10};
        int ans = Search(arr);
        System.out.println(ans);
    }
    static int Search(int[] arr){
       int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
