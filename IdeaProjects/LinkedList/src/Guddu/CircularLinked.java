package Guddu;

import java.util.Scanner;

class Circular{

        Scanner sc = new Scanner(System.in);
        static class node{
            int data;
            node next;
            node(int data){
                this.data = data;
                this.next = null;
            }

        }
        public node head = null;
        public node tail = null;
        public void create(){
            int n;
            int a;

            do{
                System.out.println("Enter data");
                a = sc.nextInt();
                System.out.println("Press to Terminate");
                n = sc.nextInt();
            }while(n==1);
            node newNode =new node(a);

            if(head==null){
                newNode = head;

            }else{
                newNode.next = head;
                head = newNode;


            }
        }
        public void traverse(){
            node temp = head;
            if(head==null){
                System.out.println("Linked List doesn't exist");
            }else {
                while(temp==null){
                    temp.next=head;
                    head = temp;
                }
            }
        }
        int n;
        public void insert(){
            node newnode = new node(n);
            int n = sc.nextInt();
            if(head==null){
                head = newnode;
            }
            else {
                switch(n){
                    case 1:
                        System.out.println("Number do yrr");
                        n = sc.nextInt();
                        newnode.next = head;
                        head = newnode;
                        break;
                    case 2:

                        node temp = head;
                        while(temp.next!=null){
                            System.out.println("please number");
                            n=sc.nextInt();
                            temp.next = newnode;
                            newnode = temp;

                        }break;
                    case 3:

                        while(head.next==null){
                            System.out.println("Number");
                            n = sc.nextInt();
                            head.next=newnode;
                            newnode.next = head;
                        }
                }
            }
        }
        public void delete(){
            if(head==null){
                System.out.println("Linked List id empty");
            }else{
                if(head!=null){
                    node current = head;
                    while(current.next!=null){
                        current = current.next;
                    }
                    tail = current;
                    tail.next = head;
                }else{
                    head = tail = null;
                }
            }
        }
        public void display(){
            node current = head;
            if(head==null){
                System.out.println("List is empty");
            }
            while(current!=null){
                System.out.println(current.data+"");
                current = current.next;

            }
            System.out.println( " ");
        }
}

public class CircularLinked {
    public static void main(String[] args) {
        Circular c = new Circular();
        c.create();
        c.insert();
        c.traverse();
        c.delete();
        c.display();
    }
}
