package com.bridgelabz;

class Node {
    int data;
    Node next;

    //Node Constructor for Creating New Node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;
    //Insert Data in New Node
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head==null){
            head =newNode;
            tail=newNode;
        }else {
            newNode.next=head;
            head=newNode;
        }
    }
//Display the Linked List using Show Method
    public void showList(){
        if (head==null){
            System.out.println("LinkedList is Empty");
        }else {
            Node temp =head;
            while (temp != null){
                System.out.println(temp.data +"->");
                temp=temp.next;
            }
        }
    }

}

public class LinkedListProgram {
    public static void main(String[] args) {

        System.out.println("LinkedList Problem");

        LinkedList linkedList = new LinkedList();
        //Insert 70, 50, 36 in Linked List Nodes
        linkedList.insertFirst(70);
        linkedList.insertFirst(30);
        linkedList.insertFirst(56);
        linkedList.showList();
    }
}
