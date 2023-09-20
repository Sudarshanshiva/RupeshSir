package com.Guddu;


import java.util.ArrayList;
import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        System.out.println(arr);
        HashSet<Integer> set = new HashSet<>(arr);

        System.out.println(set);


    }
}
