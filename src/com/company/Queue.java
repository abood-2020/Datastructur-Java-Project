package com.company;

public class Queue {

        Node front =null;
        Node rear =null;

        public void addQueue(Reservation a){
            Node temp = new Node(a);

            if (rear == null) {
                front = rear = temp;
                return;
            }
            rear.next = temp;
            rear = temp;
        }

        public void dequeue(){
            if (front == null){
                return;
            }
            Node temp = front;
            front = front.next;

            if (front == null){
                rear = null;
            }
        }

        public Object printfront(){
            return front;
        }
        public Object printrear(){
            return rear;
        }
    }

