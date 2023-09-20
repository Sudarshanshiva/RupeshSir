package com.Guddu;


import java.util.HashMap;
import java.util.Stack;

class Solutionp{
    void fun(String s){


        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            System.out.print(c +" ");

        }

    }

}

public class Palindrome {
    public static void main(String[] args) {
        Solutionp p = new Solutionp();
        p.fun("abcd");
    }
}
