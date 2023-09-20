package com.Guddu;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }else if(c=='{'){
                stack.push('}');
            }else if(c=='['){
                stack.push(']');
            }else if(stack.isEmpty() || stack.pop()!=c){
                return false;
            }
        }

        return stack.isEmpty();


    }
}

public class Parenthesis {
    public static void main(String[] args) {
        Solution a = new Solution();
        boolean ans=a.isValid("()" +
                "");
        System.out.println(ans);
    }
}
