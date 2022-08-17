package com.company;

public class LinkedList<T> {
         NodeLinked head;
         public void addFirst(Object data){
             NodeLinked newNode = new NodeLinked(data);
            newNode.next= head;
            head= newNode;
        }
        public boolean isEmpty(){
            if(head == null) return true;
            else return false;
        }

        public void addLast(Object data){
            if(head == null) {
                head = new NodeLinked(data);
                return;
            }
            NodeLinked current = head;
            while(current .next !=null){
                current = current.next;
            }
            current.next= new NodeLinked(data);
        }
        public void print(){
            NodeLinked current =head;
            while (current != null){
                System.out.print(current.data + " --> ");
                current= current.next;
            }
            System.out.println();
        }
        public NodeLinked delete(Object data){
            NodeLinked current = head;
            NodeLinked previous = null;
            while(current.data != data){
                if(current.next == null) {
                    return null;
                }
                else{
                    previous = current ;
                    current = current.next;
                }
            }
            if(current== head){
                head= head.next;
            } else{
                previous.next=current.next;
            }
            return current;
        }

        public void addAtMid(int data)
        {
            // if list is empty
            if (head == null)
                head = new NodeLinked(data);
            else {
                // get a new node
                NodeLinked newNode = new NodeLinked(data);
                NodeLinked slow = head;
                NodeLinked fast = head.next;
                while (fast != null && fast.next
                        != null)
                {
                    // slow pointer move one node
                    slow = slow.next;
                    // fast pointer move two nodes
                    fast = fast.next.next;
                }
                // insert the 'newNode' and adjust
                // the required links
                newNode.next = slow.next;
                slow.next = newNode;
            }
        }
    }

