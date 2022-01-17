package com.bridgelabz;

class Node {
    private int data;
    private Node next;

    //Node Constructor for Creating New Node
    Node(int data) {
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
    }
}

public class LinkedListProgram {
    public static void main(String[] args) {
        //Welcome Message
        System.out.println("LinkedList Problem");

        LinkedList linkedList = new LinkedList();
        //Insert 70, 50, 36 in Linked List Nodes
        linkedList.insertFirst(70);
        linkedList.insertFirst(30);
        linkedList.insertFirst(56);
    }
}
