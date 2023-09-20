package com.Guddu;

import java.util.*;




public class Arraylist {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String name = in.next();
        list.add(name);
//       if(list.contains("e")){
//           System.out.println(list);
//       }else{
//           System.out.println("sorry");
//       }
        for(String naam:list){
            if(naam.contains("e")){
                System.out.println(naam);
            }
        }

    }
}
