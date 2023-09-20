package com.Guddu;

import java.util.PriorityQueue;
import java.util.Scanner;

class QueueList{
    PriorityQueue<String> pq = new PriorityQueue<>();

    int front = 0;
    int rare = 0;
    String naam;
    int a;
    Scanner sc = new Scanner(System.in);

    void enqueue(){

        System.out.println("Enter Number of Data");
         a = sc.nextInt();
        for (int i = 0; i <a; i++) {
            System.out.println("Enter name");
            String naam = sc.next();
            rare = rare+1;
        }
    }void dequeue(){
        for (int i = 0; i < a; i++) {
           pq.add(naam);
        }

    }
}

public class Queue {
    public static void main(String[] args) {
        QueueList q = new QueueList();
        q.enqueue();
        q.dequeue();


    }
}
