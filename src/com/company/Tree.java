package com.company;

public class Tree {

        NodeTree root;
        NodeTree pointer;

        public void add(Person data) {
            if (root == null) {
                root = new NodeTree(data);
                System.out.println(root.data);
            }
            else{
                pointer = root;
                while (true) {
                    if (data.id > pointer.data.id) {
                        if (pointer.right == null) {
                            pointer.right = new NodeTree(data);
                        } else {
                            pointer = pointer.right;
                        }

                    } else if (data.id < pointer.data.id) {
                        if (pointer.left == null) {
                            pointer.left = new NodeTree(data);
                        }
                        else {
                            pointer = pointer.left;
                        }
                    }
                }
            }

        }
    public NodeTree find(int data) {
        NodeTree pointer=root;
        if(root != null){
            while(true){
                if(data==pointer.data.id){
                    return pointer;
                }
                else if(data>pointer.data.id && pointer.right !=null){
                    pointer = pointer.left;
                }
                else{
                    return null;
                }
            }
        }
        else{
            System.out.println(" ---------- ------ ------- Not Found Doctor");
            return null;
        }
    }
//        public NodeTree (int data) {
//            if(root.data.id == data) return root;
//            else return find(data,root);
//        }
//        public NodeTree find(int data , NodeTree current)
//        {
//            if(current.left.data.id == data){
//                return current.left;
//            }
//            else if(current.right.data.id == data){
//                return current.right;
//            }
//            if(data<current.data.id){
//                return find(data , current.left);
//            }
//            else {
//                return find(data,current.right);}
//        }
    public boolean containsNodeRecursive(NodeTree current,int value){
        if (current == null) {
            return false;
        }
        if (value == current.data.id) {
            return true;
        }
        return value < current.data.id
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);

    }
    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }
//    public NodeTree delete(NodeTree current,int value){
//        if (current == null) {
//            return null;
//        }
//        if (value == current.data.id) {
//        }
//        if (value < current.data.id) {
//            current.left = delete(current.left, value);
//            return current;
//        }
//        if (current.left == null && current.right == null)
//            return null;
//        if (current.right == null)
//            return current.left;
//
//        if (current.left == null)
//            return current.right;
//
//        return null;
//    }
    public NodeTree delete(NodeTree node , int data){
        if(node==null){
            return null;
        }
        if(data<node.data.id){
            node.left=delete(node.left , data);
        }else if(data>node.data.id ){
            node.right = delete(node.right , data);

        }else
        if(node.left ==null || node.right==null){
            NodeTree temp =null;
            temp=node.left==null? node.right : node.left;
            if(temp==null){
                return null;
            }else
                return node;
        }else{
            NodeTree successor = getSuccessor(node);
            node.data=successor.data;
            node.right=delete(node.right , data);
        }
        return node;
    }

    public NodeTree getSuccessor(NodeTree node){
        if(node == null){
            return null;
        }
        NodeTree temp = node.left;
        while(temp != null){
            temp = temp.left;
        }
        return temp;
    }
}
