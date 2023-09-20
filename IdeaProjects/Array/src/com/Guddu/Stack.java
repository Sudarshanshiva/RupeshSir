package com.Guddu;

import java.util.Arrays;
import java.util.Scanner;

class StackList{
    int top = -1;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];

    void push(){

        if(top>n-1){
            System.out.println("Overflow");
        }
       for (int i=0;i<n;i++){
           System.out.println("Enter Data");
           arr[i] = in.nextInt();
           top = top+1;
       }
    }
    void display(){
        System.out.println(Arrays.toString(arr));
    }
}
public class Stack {
    public static void main(String[] args) {
      StackList s = new StackList();
      s.push();
      s.display();


    }
}
