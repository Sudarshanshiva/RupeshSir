package com.shiva;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {10,30,3,5,23,-5};
        int target = 5;
        System.out.println(Search(arr,target,1,4));
    }
    static int Search(int[] arr,int target,int start,int end){
        if (arr.length ==0){
            return -1;
        }
        for (int index = start; index <end; index++) {
            int element = arr[index];
           if (element == target){
               return index;
           }
        }
        return -1;
    }
}
