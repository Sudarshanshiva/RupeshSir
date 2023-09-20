package com.shiva;

public class Main {
    public static void main(String[] args){
       int[] arr = {12,19,5,6,20};
       int target = 6;
       int ans = LinearSearch(arr,target);
        System.out.println(ans);
    }
    static int LinearSearch(int[] arr,int target){
        if (arr.length==0) {
            return -1;
        }
        for(int index = 0;index<arr.length;index++){
            int element = arr[index];
            if(element==target) {
                return index;
            }
        }
        return -1;
    }

}