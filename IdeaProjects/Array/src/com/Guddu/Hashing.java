package com.Guddu;
import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);
        if(set.contains(5)){
            System.out.println("Contain");
        }else{
            System.out.println("Don't");
        }
        set.remove(1);
        System.out.println(set);
        System.out.println(set.size());
        set.add(6);
        System.out.println(set);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
