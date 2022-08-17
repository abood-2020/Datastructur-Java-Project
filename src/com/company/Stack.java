package com.company;

public class Stack {

        Node top;
        int size;
        public class Node{
            public DonateBlood data;
            public Node next;
            public Node(DonateBlood data){
                this.data=data;
                this.next=null;
            }
        }

        public void push(DonateBlood data){
            Node temNode = new Node(data);
            temNode.next=top;
            top=temNode;
            size++;
        }

        public void pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty ...");

            }
            else{
                top = top.next;
                size--;
            }
        }
        public DonateBlood peek(){
            if(isEmpty()){
                return null;
            }
            return top.data;
        }

        public int size(){
            return size;
        }

        public boolean isEmpty(){
            return size ==0;
        }


        public void print(){
            Node current = top;
            while(current != null){
                System.out.println(current.data+" ");
                current =current.next;
            }
        }

}

