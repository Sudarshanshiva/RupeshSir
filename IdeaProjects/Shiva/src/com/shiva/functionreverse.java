package com.shiva;

import java.util.Scanner;

public class functionreverse {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter your name: ");
        int naam = in.nextInt();
        String personalised = myGreet(naam);
        System.out.println(personalised);
    }

     static String myGreet(int name) {
        String message = "Hello"+ name;
        return message;

    }
}
