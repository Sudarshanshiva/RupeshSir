package com.shiva;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr={{12,10,3,5},
                {20,30,4,7},
                {10,15,25}};
//        int target = 4;
//        System.out.println(Search(arr,target));

        System.out.println(max(arr));
    }
//    static int Search(int[][] arr,int target){
//        if (arr.length==0){
//            return -1;
//        }
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (arr[row][col]==target){
////                    return col;
//                    return row;
//                }
//            }
//        }
//        return -1;
//    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]>max){
                   max=arr[row][col];
                }
            }
        }
        return max;
    }
}
